package selenium.alert;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.awt.*;
import java.awt.event.KeyEvent;

public class AlertSauceDemoExample {

    public static void main(String[] args) throws InterruptedException, AWTException {

        ChromeOptions cp = new ChromeOptions();
        cp.addArguments("--disable-extensions");
        cp.addArguments("--incognito");

        WebDriver driver = new ChromeDriver(cp);
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        Thread.sleep(3000);

        /*Actions a = new Actions(driver);
        a.sendKeys(Keys.ESCAPE).perform();*/

/*        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement e = driver.findElement(By.xpath("//button[text()='OK']"));
        js.executeScript("arguments[0].click();", e);*/

/*        Robot r = new Robot();
        r.keyPress(KeyEvent.VK_ESCAPE);
        r.keyRelease(KeyEvent.VK_ESCAPE);*/

/*        WebElement e = driver.findElement(By.xpath("//button[text()='OK']"));
        Actions a = new Actions(driver);
        a.moveToElement(e).perform();*/

    }
}
