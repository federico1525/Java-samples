package tutorial.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Sliders {

    private WebDriver driver;
    private String baseUrl;


    @Before
    public void setup() throws Exception{
        driver = new FirefoxDriver();
        baseUrl = "http://dhtmlx.com/docs/products/dhtmlxSlider/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testSlider() throws Exception{
        driver.get(baseUrl);
        Thread.sleep(2000);

        WebElement sliderElement = driver.findElement(By.xpath("//div[@id='sliderBox2']//div[@class='dhxsl_runner']"));
        Actions azione = new Actions(driver);
//        azione.dragAndDropBy(sliderElement, 100, 0).build().perform();
//        Thread.sleep(4000);
//        azione.dragAndDropBy(sliderElement, 20, 0).build().perform();
//        Thread.sleep(5000);
        azione.dragAndDropBy(sliderElement, 50, 0).build().perform();
        Thread.sleep(4000);


        WebElement sliderRate = driver.findElement(By.id("rate"));
        sliderRate.clear();
        sliderRate.sendKeys("0");
        sliderRate.sendKeys(Keys.RETURN);

        Thread.sleep(4000);

        sliderRate.clear();
        sliderRate.sendKeys("30");
        sliderRate.sendKeys(Keys.RETURN);


    }


    @After
    public void afterTest() throws Exception{
//        driver.quit();
    }


}
