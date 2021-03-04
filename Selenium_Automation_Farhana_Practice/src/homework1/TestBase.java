package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class TestBase {
    static WebDriver driver;
    String amazonUrl="https://www.amazon.com/";
//    String productName="Mask";
//    String searchBoxLocator="twotabsearchtextbox";
//    String searchButtonLocator="nav-search-submit-button";


    @BeforeMethod()
    public static void getBrowserAndUrl() throws InterruptedException {
        //Firefox
//        String foreFoxDriverPath="BrowserDriver/windows/geckodriver.exe";
//        System.setProperty("webdriver.gecko.driver",foreFoxDriverPath);
//        WebDriver driver1=new FirefoxDriver();
//        driver1.get("https://amazon.com");

        //Edge
//        String edgeDriverPath="BrowserDriver/windows/msedgedriver.exe";
//        System.setProperty("webdriver.edge.driver", edgeDriverPath);
//        WebDriver driver3=new EdgeDriver();
//        driver3.get("https://amazon.com");

        //Chrome
        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.get("amazonUrl");
        //driver.get("https://amazon.com");
        driver.manage().window().maximize();
    }
    // Action Method
        public void checkSearchBox(){
        // Enter product name
        //driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
        // click on searchButton
        //Driver.findElement(By.id(searchButtonLocator)).click();
    }
        @AfterMethod
        public static void tearDown() throws InterruptedException {
            driver.manage().deleteAllCookies();
            Thread.sleep(3000);
            driver.close();
        }

        public static void sleepFor(int seconds) throws InterruptedException {
            Thread.sleep(seconds*1000);
        }

    }



