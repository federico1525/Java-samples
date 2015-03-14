package tutorial.selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class dragAndDrop {
    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.dhtmlx.com/docs/products/dhtmlxTree/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testDragAndDrop() throws Exception {

        driver.get(baseUrl);
        Thread.sleep(10000);


        WebElement fromElement = driver.findElement(By.xpath("//div[@id='treebox1']//span[text()='James Johns']"));
        WebElement toElement = driver.findElement(By.xpath(".//*[@id='treebox2']//span[text()='History']"));

        Actions action = new Actions(driver);
        action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();


        Thread.sleep(5000);

        WebElement fromElement2 = driver.findElement(By.xpath("//div[@id='treebox2']//span[text()='Robert Crais']"));
        WebElement toElement2 = driver.findElement(By.xpath(".//*[@id='treebox1']//span[text()='Bestsellers']"));

        action.dragAndDrop(fromElement2, toElement2).build().perform();


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}


