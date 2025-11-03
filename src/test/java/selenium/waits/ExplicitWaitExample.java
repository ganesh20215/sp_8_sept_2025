package selenium.waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWaitExample {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/dynamic.html");

        WebDriverWait w = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.findElement(By.id("reveal")).click();
        w.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("revealed"))));
        driver.findElement(By.id("revealed")).sendKeys("Test Data");

    }
}
