package selenium.alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NeedOfAlertExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement alertId = driver.findElement(By.id("confirmbtn"));
        alertId.click();

        Thread.sleep(3000);

        Alert a = driver.switchTo().alert();
        System.out.println(a.getText());
        a.dismiss();

        driver.findElement(By.id("benzcheck")).click();
    }
}
