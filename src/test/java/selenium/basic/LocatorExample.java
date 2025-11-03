package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //Id locator
        //WebElement userNameTextBox = driver.findElement(By.id("login1"));
        //userNameTextBox.sendKeys("Test Data");

        //ClassName locator
        //WebElement loginBtn = driver.findElement(By.className("signin-btn"));
        //loginBtn.click();

        //name locator
        //WebElement passwordTextBox = driver.findElement(By.name("passwd"));
        //passwordTextBox.sendKeys("Test Data");

        //linktext locator
        //WebElement forgotPassword = driver.findElement(By.linkText("Forgot password?"));
        //forgotPassword.click();

        //partialLinkText locator
        //WebElement forgotPassword = driver.findElement(By.partialLinkText("password?"));
        //forgotPassword.click();

        //tagName locator
        //List<WebElement> label = driver.findElements(By.tagName("label"));
        //System.out.println(label.size());

        //cssSelector locator
        //WebElement userNameTextBox = driver.findElement(By.cssSelector("input[id=login1]"));
        //WebElement userNameTextBox = driver.findElement(By.cssSelector("input#login1"));
        //WebElement userNameTextBox = driver.findElement(By.cssSelector("input[class=email-input]"));
        //WebElement userNameTextBox = driver.findElement(By.cssSelector("input.email-input"));
        //userNameTextBox.sendKeys("Test Data Check");

        //Absolute xpath Locator
        //WebElement userNameTextBox = driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div[]/div[2]/form/div[1]/div/input"));
        //userNameTextBox.sendKeys("Test Data");

        //Relative xpath Locator
        //WebElement userNameTextBox = driver.findElement(By.xpath("//input[@name='passwd']"));
        //userNameTextBox.sendKeys("Test Data");

        //text()
        //WebElement forgotPassword = driver.findElement(By.xpath("//a[text()='Forgot password?']"));
        //forgotPassword.click();

        //And/Or in xpath
        //WebElement userNameTextBox = driver.findElement(By.xpath("//input[@class='email-input' and @name='login']"));
        //WebElement userNameTextBox = driver.findElement(By.xpath("//input[@class='email-input' or @name='log']"));
        //userNameTextBox.sendKeys("Test Data");

        //starts-with() xpath
        //WebElement newAccountLink = driver.findElement(By.xpath("//a[starts-with(text(),'Get a new')]"));
        //WebElement userNameTextBox = driver.findElement(By.xpath("//input[starts-with(@class,'email')]"));
        //userNameTextBox.sendKeys("Test Data");

        //starts-with() xpath
        WebElement newAccountLink = driver.findElement(By.xpath("//a[contains(text(),'new')]"));
        //WebElement userNameTextBox = driver.findElement(By.xpath("//input[contains(@class,'input')]"));
        newAccountLink.click();
    }
}
