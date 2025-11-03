package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderWithParameter {

    @DataProvider(name = "test-data")
    public Object[][] setData() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"Test", "secret_sauce"},
                {"standard_user", "Test"},
                {"Test", "Test"},
        };
    }

    @Test(dataProvider = "test-data")
    public void verifyLogin(String userName, String password) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.id("user-name")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.id("login-button")).click();
    }
}
