package com.evilfede.Webdriverbasics;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import static junit.framework.Assert.assertTrue;

public class FirstTest {
    @Test
    public void driverIsKing(){

        WebDriver driver = new HtmlUnitDriver();
        driver.get("http://compendiumdev.co.uk/selenium");
//        WebDriver driver = new ChromeDriver();
//        WebDriver driver = new FirefoxDriver();
//        driver.navigate().to ("http://seleniumsimplified.com");
        assertTrue(driver.getTitle().startsWith("Selenium Simplified"));
    }
}
