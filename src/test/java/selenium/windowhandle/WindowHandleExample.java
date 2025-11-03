package selenium.windowhandle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandleExample {

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.letskodeit.com/practice");
        //Thread.sleep(2000);

        driver.findElement(By.id("openwindow")).click();
        String parentWindowId = driver.getWindowHandle(); //point to the single window
        Set<String> allWindowIds = driver.getWindowHandles();  //points to the multiple windows
        for (String s : allWindowIds) {
            if (!s.contentEquals(parentWindowId)) {
                driver.switchTo().window(s);
                //Thread.sleep(2000);
                driver.findElement(By.linkText("BLOG")).click();
                //Thread.sleep(2000);
                System.out.println(driver.getTitle());
                //driver.close();
            }
        }
        driver.switchTo().window(parentWindowId);
        driver.findElement(By.id("benzcheck")).click();
        //Thread.sleep(2000);
        driver.close();

    }
}
