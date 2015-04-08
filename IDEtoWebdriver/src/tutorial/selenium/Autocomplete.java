package tutorial.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Autocomplete {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "https://www.southwest.com/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void swAutocomplete() throws Exception {
        driver.get(baseUrl);
        String searchingText = "Newark, NJ - EWR";
        String partialText = "New York";


        WebElement text = driver.findElement(By.id("air-city-departure"));
        //div[@class='overlay']//div[@class='js-overlay-container overlay--container']
        text.sendKeys(partialText);

        WebElement element = driver.findElement(By.xpath("//div[@class='js-overlay-container overlay--container']"));
        List<WebElement> results = element.findElements(By.tagName("li"));

        System.out.println("Number of results: " + results.size());

        WebElement desiredResult = null;
        Thread.sleep(2000);
        for (WebElement result : results){
            if (result.getText().equals(searchingText)){
                desiredResult = result;
            }
            System.out.println(result.getText());
        }
        desiredResult.click();
    }

    @After
    public void afterTest(){
        driver.quit();

    }

}
