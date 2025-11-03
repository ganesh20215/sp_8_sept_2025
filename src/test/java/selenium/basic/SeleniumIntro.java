package selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();     //upcasting
  /*      driver = new FirefoxDriver();
        driver = new EdgeDriver();*/

        //ChromeDriver sadanand = new ChromeDriver();
        //sadanand = new FirefoxDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        //driver.close();
    }
}
