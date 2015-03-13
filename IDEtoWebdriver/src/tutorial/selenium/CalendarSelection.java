package tutorial.selenium;

import java.util.concurrent.TimeUnit;
import java.util.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class CalendarSelection {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.expedia.com/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    @Test
    public void testDropdown() throws Exception {
        driver.get(baseUrl);

        WebElement cal = driver.findElement(By.id("package-departing"));
        cal.click();

        WebElement calDays = driver.findElement(By.xpath("//div[@class='cal']//section[1]//ul[@class='cal-dates']"));


        List<WebElement> days = calDays.findElements(By.tagName("li"));

        for (WebElement giorno : days) {
//            System.out.println(giorno.getText());
            if (giorno.getText().equals("30")) {
//                Thread.sleep(1000);
                System.out.println("######");
                giorno.findElement(By.linkText("30")).click();
                break;
            }
        }
    }




    @After
    public void afterTest(){
        driver.quit();

    }

}

