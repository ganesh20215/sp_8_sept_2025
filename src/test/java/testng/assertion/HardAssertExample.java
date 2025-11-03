package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssertExample {

    @Test
    public void verifyHardAssertExample(){
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        Assert.assertFalse(loginBtn.isDisplayed());
        Assert.assertEquals(driver.getTitle(), "Swag Labs");
        driver.close();
    }
}
