package tutorial.selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.classes.SearchPage;
import java.lang.*;

import java.util.concurrent.TimeUnit;

public class TestNG {



    private WebDriver driver;
    private String baseUrl;
    static Logger log = Logger.getLogger(TestNG.class);


    @BeforeMethod
    public void beforeMethod() {
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.com/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        PropertyConfigurator.configure("log4j.properties");
//        log = Logger.getLogger(TestNG.class);
    }

    @Test
    public void testMethod() throws Exception {
        driver.get(baseUrl);
        SearchPage.navigateToFlightsTab(driver);
        SearchPage.fillOriginTextBox(driver, "New York");
        SearchPage.fillDestinationTextBox(driver, "Chicago");
        SearchPage.fillDepartureDateTextBox(driver, "12/25/2014");
        SearchPage.fillReturnDateTextBox(driver, "12/31/2014");
        Thread.sleep(3000);
    }

    @Test
    public void fillAdvancedInfo(){
        SearchPage.clickOnAdvancedLink(driver);
        SearchPage.clickNonStopCheckBox(driver);
        SearchPage.selectFlightClass(driver, "first");

    }

    @AfterMethod
    public void afterMethod() {
    }
}
