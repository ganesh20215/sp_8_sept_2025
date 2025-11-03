package selenium.iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class IFrameExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/frames");

        /*List<WebElement> allElements = driver.findElements(By.tagName("iframe"));
        System.out.println(allElements.size());*/

        //with name/id
        //driver.switchTo().frame("frame2");

        //with web element
        WebElement frame = driver.findElement(By.xpath("//iframe[@id='frame2']"));
        driver.switchTo().frame(frame);

        WebElement element = driver.findElement(By.xpath("//h1[text()='This is a sample page']"));
        System.out.println(element.getText());

        driver.switchTo().parentFrame();

        WebElement frameElement = driver.findElement(By.xpath("//h1[text()='Frames']"));
        System.out.println(frameElement.getText());
    }
}
