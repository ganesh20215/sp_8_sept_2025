package selenium.actions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardBasedActions {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");

        WebElement searchTextBox = driver.findElement(By.name("q"));

        Actions a = new Actions(driver);
        a.moveToElement(searchTextBox)
                .pause(4000)
                .click(searchTextBox)
                .pause(2000)
                .keyDown(Keys.SHIFT)
                .sendKeys("t shirt for men")
                .pause(3000)
                .keyUp(Keys.SHIFT)
                .sendKeys(Keys.ENTER)
                .perform();
    }
}
