package phptravelshomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class phpDesign {

   public static WebDriver driver;

   public static void openBrowser(String url){

        System.setProperty("webdriver.chrome.driver","./BrowserDriver/windows/chromedriver.exe");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

       public static void quitBrowser() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

}
