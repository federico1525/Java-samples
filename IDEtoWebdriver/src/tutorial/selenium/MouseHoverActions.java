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

public class MouseHoverActions {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.dhtmlx.com/docs/products/dhtmlxSlider/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testMouseHoverActions() throws Exception {
        driver.get(baseUrl);
        Thread.sleep(1000);

        WebElement mainElement = driver.findElement(By.xpath(".//*[@id='active']/a"));
        WebElement subElement = driver.findElement(By.linkText("Tree"));

        Actions action = new Actions(driver);

        action.moveToElement(mainElement).perform();
        Thread.sleep(2000);
        action.moveToElement(subElement).click().perform();

    }



    @After
    public void tearDown() throws Exception {
    }
}
