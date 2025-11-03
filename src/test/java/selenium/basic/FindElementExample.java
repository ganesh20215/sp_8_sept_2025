package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //1. To locate single and unique web element on webpage
        //2. WebElement is the return type of findElement()
        //3. If element isn't find by findElement() then this method throws an NoSuchElementException

        WebElement element = driver.findElement(By.id("log"));
        element.sendKeys("Test Data");

    }
}
