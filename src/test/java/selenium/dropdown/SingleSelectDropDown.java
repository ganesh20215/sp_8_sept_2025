package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement dropDown = driver.findElement(By.id("carselect"));

        Select s = new Select(dropDown);

        //selectByIndex()
        Thread.sleep(2000);
        s.selectByIndex(2);

        //selectByValue()
        Thread.sleep(2000);
        s.selectByValue("benz");
        System.out.println(s.getFirstSelectedOption().getText());

        //selectByVisibleText()
        Thread.sleep(2000);
        s.selectByVisibleText("BMW");

        Thread.sleep(2000);
    }
}
