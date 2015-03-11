package com.evilfede.webdriver;

import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static junit.framework.Assert.assertTrue;

/**
 * Created by fede on 3/9/15.
 */
public class MyFirstTest {
    @Test
    public void startWebDriver(){
        WebDriver driver = new FirefoxDriver();

        driver.navigate().to ("http://seleniumsimplified.com");
        assertTrue("title should start with Selenium Simplified", driver.getTitle().startsWith("Selenium Simplified"));

        driver.close();

        driver.quit();
    }
}
