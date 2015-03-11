package tutorial.selenium;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class IDEtoWebdriver {

    private WebDriver driver;
    private String baseUrl;
    private boolean acceptNextAlert = true;
    private StringBuffer verificationErrors = new StringBuffer();

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.enterprise.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testUntitled() throws Exception {
        driver.get(baseUrl + "/car_rental/home.do");

        // title of the webpage
        String title = driver.getTitle();
        System.out.println(title);

        // current url loaded
        String getCurrentURL = driver. getCurrentUrl();
        System.out.println(getCurrentURL);

        // gets page source
        String source = driver.getPageSource();
        System.out.println(source);

        //refresh
        driver.navigate().refresh();
        driver.navigate().to(driver.getCurrentUrl());
        driver.get(driver.getCurrentUrl());


        driver.findElement(By.id("searchCriteria")).clear();
        driver.findElement(By.id("searchCriteria")).sendKeys("sfo");
        driver.findElement(By.id("search")).click();

        //Navigate back
        driver.navigate().back();

        // Navigate forward
        driver.navigate().forward();


//        driver.findElement(By.cssSelector("a.secondaryAction2.right > strong")).click();

//        driver.findElement(By.xpath(".//*[@id='renterFirstName']")).sendKeys("federico");
//        driver.findElement(By.xpath(".//*[@id='renterLastName']")).sendKeys("casali");

        driver.findElement(By.xpath((".//*[@id='btnSelect']//a[contains(@href, 'SPAR')]"))).click();
    }

    @After
    public void tearDown() throws Exception {
        // close the current window, if it is last then quit
//        driver.close();

        // quit browser
        driver.quit();
        String verificationErrorString = verificationErrors.toString();
        if (!"".equals(verificationErrorString)) {
            fail(verificationErrorString);
        }
    }

}