package amazonhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class HelperClass {
    public static WebDriver driver;

    public static void openBrowser(String url){

        System.setProperty("webdriver.chrome.driver","./BrowserDriver/windows/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static void logIn(){

        driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
        driver.findElement(By.cssSelector("#ap_email")).sendKeys("");
        driver.findElement(By.xpath("//input[@tabindex='5']")).click();

    }


    public static void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }
}
