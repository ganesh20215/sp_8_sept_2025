package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement disableElement = driver.findElement(By.id("disabled-button"));
        WebElement enabledElement = driver.findElement(By.id("enabled-button"));
        WebElement textBoxElement = driver.findElement(By.id("enabled-example-input"));

        System.out.println(textBoxElement.isEnabled()); //true
        disableElement.click();
        System.out.println(textBoxElement.isEnabled()); //false
        enabledElement.click();
        System.out.println(textBoxElement.isEnabled()); //true

    }
}
