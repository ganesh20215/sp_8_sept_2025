package selenium.uploadfile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/upload");

        WebElement upload = driver.findElement(By.id("file-upload"));
        upload.sendKeys("D:\\classes\\Edso\\AutomationTesting\\Selenium\\SeleniumWebDriver.pptx");

        driver.findElement(By.id("file-submit")).click();

        WebElement fileUploadMessage = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));

        if (fileUploadMessage.isDisplayed()){
            System.out.println("File uploaded sucessfully");
        }else {
            System.out.println("File isn't uploaded sucessfully");
        }
    }
}
