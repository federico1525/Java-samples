package tutorial.selenium;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import page.classes.SearchPage;

import java.util.concurrent.TimeUnit;

public class TestNG_dependent {
    private WebDriver driver;
    private String baseUrl;

    static Logger log = Logger.getLogger(TestNG.class);

    @BeforeClass
    public void beforeClass(){
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.com/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        PropertyConfigurator.configure("log4j.properties");
        driver.get(baseUrl);
    }

    @Test
    public void searchFlights() throws Exception {
        SearchPage.navigateToFlightsTab(driver);
        SearchPage.fillOriginTextBox(driver, "New York");
        SearchPage.fillDestinationTextBox(driver, "Chicago");
        SearchPage.fillDepartureDateTextBox(driver, "10/28/2015");
        SearchPage.fillReturnDateTextBox(driver, "10/31/2015");
        SearchPage.clickOnSearchButton(driver);
    }

    @Test(dependsOnMethods = {"searchFlights"})
    public void selectMorningFlight(){
        SearchPage.morningFlightBox(driver);
    }

    @AfterTest
    public void afterTest(){

    }
}
