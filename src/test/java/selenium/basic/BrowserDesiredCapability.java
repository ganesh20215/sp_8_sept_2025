package selenium.basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BrowserDesiredCapability {

    public static void main(String[] args) {

        ChromeOptions cp = new ChromeOptions();
        cp.setBinary("D:\\classes\\Edso\\AutomationTesting\\Selenium\\WebDriver_Version\\chrome-win64\\chrome-win64\\chrome.exe");
        //cp.addArguments("--headless");

        WebDriver driver = new ChromeDriver(cp);
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
       /* driver.manage().window().maximize();
        driver.manage().window().minimize();*/

        //getTitle()
        /*String title = driver.getTitle();
        System.out.println(title);*/

        //getCurrentUrl()
        /*String url = driver.getCurrentUrl();
        System.out.println(url);*/

        //getPageSource()
        String source = driver.getPageSource();
        System.out.println(source);
    }
}
