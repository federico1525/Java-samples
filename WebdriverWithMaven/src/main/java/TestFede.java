import org.junit.AfterClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class TestFede {
    private WebDriver driver;

    @BeforeClass
    public void beforeTest(){
        driver = new FirefoxDriver();
        driver.get("http://www.expedia.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void verifySearch() {
        driver.findElement(By.id("tab-flight-tab")).click();
        WebElement search = driver.findElement(By.id("flight-origin"));
        search.sendKeys("san francisco");
        WebElement searchButton = driver.findElement(By.id("flight-destination"));
        searchButton.click();
    }

    @Test (dependsOnMethods = "verifySearch")
    public void verifySearch2() throws InterruptedException {
        Thread.sleep(2000);
        Reporter.log("yeah");
    }

    @AfterClass
    public void afterTest(){
    }
}