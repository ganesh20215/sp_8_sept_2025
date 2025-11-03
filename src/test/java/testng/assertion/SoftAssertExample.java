package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertExample {

    @Test
    public void verifySoftAssertExample(){
        SoftAssert sf = new SoftAssert();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        sf.assertFalse(loginBtn.isDisplayed());
        sf.assertEquals(driver.getTitle(), "swag labs");
        sf.assertAll();
        driver.close();
    }
}
