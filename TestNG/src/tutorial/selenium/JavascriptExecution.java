package tutorial.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by fede on 3/16/15.
 */
public class JavascriptExecution {

    private WebDriver driver;
    private JavascriptExecutor js;

    @Before
    public void setUp(){
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void JavascriptExecutionerTest(){
        js.executeScript("window.location = 'http://www.expedia.com'");



    }

    @After
    public void afterTest(){
        driver.quit();
    }

}
