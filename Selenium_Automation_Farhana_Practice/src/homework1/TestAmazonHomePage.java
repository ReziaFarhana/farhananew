package homework1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestAmazonHomePage extends TestBase {

    @Test
    private static void amazonLogoTest() throws InterruptedException {
        driver.findElement(By.id("nav-logo-sprites")).click();//logo
        sleepFor(5);
    }
    @Test
    private static void bestSellersTest() throws InterruptedException {
        driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
        sleepFor(5);

    }
    @Test
    private static void bestSellerTest1() throws InterruptedException {
    driver.findElement(By.cssSelector("#nav-xshop > a:nth-child(2)")).click();
        driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
        driver.findElement(By.cssSelector("#zg_tabs > ul > li.zg_selected > div > a")).click();
               driver.findElement(By.id("zg_banner_text_wrapper")).getText();
                sleepFor(5);
    }

    @Test
    private static void searchButtonFunctionality() throws InterruptedException {

        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mask");
        driver.findElement(By.id("nav-search-submit-button")).click();
        sleepFor(5);
    }

    @Test
    private static void searchButtonFunctionality1() throws InterruptedException {
        WebElement sr = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        sr.sendKeys("vaccine");
        sleepFor(5);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    private static void searchButtonFunctionality2() throws InterruptedException {
        WebElement sr = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
        sr.sendKeys("vaccine");
        sleepFor(5);
        driver.findElement(By.id("nav-search-submit-button")).click();
    }

    @Test
    private static void helloTest(){


    }

            @Test
        public static void testLanguageSwitch() throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"icp-nav-flyout\"]/span/span[2]/span[1]")).click();
            sleepFor(4);
            driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[2]/div/label/i")).click();
            sleepFor(4);
            driver.findElement(By.xpath("//*[@id=\"customer-preferences\"]/div/div/form/div[1]/div[1]/div[1]/div/label/i")).click();
            sleepFor(4);
            driver.navigate().back();
        }



}
