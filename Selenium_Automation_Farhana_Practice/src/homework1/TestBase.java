//package homework1;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;
//
//public class TestBase {
//    static WebDriver driver;
//    String amazonUrl="https://www.amazon.com/";
//
//
//    @BeforeMethod()
//    public static void getBrowserAndUrl() throws InterruptedException {
//
//        //Chrome
//        String chromeDriverPath = "BrowserDriver/windows/chromedriver.exe";
//        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
//        WebDriver driver = new ChromeDriver();
//        driver.get("amazonUrl");
//        //driver.get("https://amazon.com");
//        driver.manage().window().maximize();
//    }
//    // Action Method
//        public void checkSearchBox(){
//        // Enter product name
//        //driver.findElement(By.id(searchBoxLocator)).sendKeys(productName);
//        // click on searchButton
//        //Driver.findElement(By.id(searchButtonLocator)).click();
//    }
//        @AfterMethod
//        public static void tearDown() throws InterruptedException {
//            driver.manage().deleteAllCookies();
//            Thread.sleep(3000);
//            driver.close();
//        }
//
//        public static void sleepFor(int seconds) throws InterruptedException {
//            Thread.sleep(seconds*1000);
//        }
//
//    }
//
//
//
