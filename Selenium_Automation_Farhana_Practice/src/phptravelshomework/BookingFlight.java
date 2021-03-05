package phptravelshomework;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static phptravelshomework.phpDesign.driver;
import static phptravelshomework.phpDesign.openBrowser;

public class BookingFlight {

    @Test
    public static void reserveFlight(){
        openBrowser("https://www.phptravels.net/home");
        driver.findElement(By.cssSelector("#search > div > div > div > div > div > nav > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.xpath("//*[@id=\"flights\"]/div/div/form/div/div/div[1]/div[1]/div/div[2]/label")).click();
        driver.findElement(By.xpath("//*[@id=\\\"select2-drop\\\"]/div/input")).
       driver.findElement(By.linkText("Riyadh (RUH)")).click();

    }
}
