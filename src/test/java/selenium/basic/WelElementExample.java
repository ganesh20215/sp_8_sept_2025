package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WelElementExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //sendKeys()
        //WebElement userNameTextBox = driver.findElement(By.id("login1"));
        //userNameTextBox.sendKeys("Test Data");

        //Thread.sleep(2000);

        //clear()
        //userNameTextBox.clear();

        //submit();
        //driver.findElement(By.className("signin-btn")).submit();

        WebElement getANewLink = driver.findElement(By.linkText("Get a new Rediffmail ID"));
        System.out.println(getANewLink.getText());
        System.out.println(getANewLink.getTagName());
    }
}
