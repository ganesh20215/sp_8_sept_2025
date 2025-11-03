package selenium.dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class MultiSelectDropDown {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");

        WebElement dropDown = driver.findElement(By.id("multiple-select-example"));

        Select s = new Select(dropDown);

        //selectByIndex()
        Thread.sleep(2000);
        s.selectByIndex(2);

        //selectByValue()
        Thread.sleep(2000);
        s.selectByValue("orange");

        //selectByVisibleText()
        Thread.sleep(2000);
        s.selectByVisibleText("Apple");


     /*   List<WebElement> allElements = s.getAllSelectedOptions();
        for (WebElement e : allElements) {
            System.out.println(e.getText());
        }*/

/*        //deselectByIndex()
        Thread.sleep(2000);
        s.deselectByIndex(2);

        //deselectByValue()
        Thread.sleep(2000);
        s.deselectByValue("orange");

        //deselectByVisibleText()
        Thread.sleep(2000);
        s.deselectByVisibleText("Apple");*/

        s.deselectAll();

    }
}
