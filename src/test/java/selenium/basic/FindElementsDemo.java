package selenium.basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsDemo {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");

        //1. To locate multiple and unique web element on webpage
        //2. List<WebElement> is the return type of findElement()
        //3. If element isn't find by findElements() then we won't get any
        // exception and our find elements return 0 list of web elements


        List<WebElement> elements = driver.findElements(By.className("in"));
        System.out.println(elements.size());

        for (WebElement e : elements){
            System.out.println(e);
        }
    }
}
