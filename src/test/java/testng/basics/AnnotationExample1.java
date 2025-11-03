package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationExample1 {

    public static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.close();
    }

    @Test(groups = "smoke")
    public void verifyForEdso() {
        driver.get("https://www.edso.in");
    }

    @Test
    public void verifyForAmazon() {
        driver.get("https://www.amazon.in");
    }
}
