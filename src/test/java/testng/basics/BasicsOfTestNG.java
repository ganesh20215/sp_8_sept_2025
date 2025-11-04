package testng.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicsOfTestNG {

    @Test
    public void testForEdso() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.edso.in");
    }

    @Test
    public void testForAmazon() {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in");
        driver.close();
    }

}

