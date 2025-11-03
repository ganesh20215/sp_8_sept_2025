package selenium.cookies;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class GetCookiesExample {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://edso.in/");
        driver.manage().window().maximize();

/*        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.findElement(By.id("acceptCookies")).click();

        //Add Cookie
        Cookie ck = new Cookie("company", "Edso Services");
        driver.manage().addCookie(ck);

        //getCookies()
        Set<Cookie> allCookies = driver.manage().getCookies();
        for (Cookie c : allCookies){
            System.out.println(c);
        }*/

        //getCookieNamed()
        /*Cookie names = driver.manage().getCookieNamed("company");
        System.out.println(names);*/

/*        System.out.println();
        System.out.println("##################################################");

        driver.manage().addCookie(ck);*/

        //delete cookie()
        //driver.manage().deleteCookieNamed("company");
        //driver.manage().deleteAllCookies();

        Set<Cookie> allCookies2 = driver.manage().getCookies();
        for (Cookie c : allCookies2){
            System.out.println(c);
        }
    }
}
