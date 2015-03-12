package tutorial.selenium;

import java.util.List;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;

import jdk.nashorn.internal.objects.NativeJSON;
import org.junit.*;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


/**
 * Created by fede on 3/11/15.
 */
public class RadioButtonAndCheck {
    private WebDriver driver;
    private String baseUrl;


    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.expedia.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void RadioButtonAndCjekc() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.id("tab-flight-tab")).click();

        boolean checked = false;

//        List<WebElement> radioButtons = driver.findElements(By.name("flight-type"));
//        List<WebElement> radioButtons = driver.findElements(By.className("col link"));
        List<WebElement> radioButtons = driver.findElements(By.xpath(".//*[@type='checkbox']"));

        for (int i = 0; i < radioButtons.size(); i++) {
//            checked = radioButtons.get(i).isSelected();
            radioButtons.get(i + 1).click();
            Thread.sleep(2000);
            break;
        }

        driver.findElement(By.id("tab-car-tab")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath(".//*[@id='car-options-toggle']")).click();
        Thread.sleep(2000);

        List<WebElement> checkBoxButtonsCar = driver.findElements(By.xpath("//*[@type='checkbox']"));
        System.out.println("##### " + checkBoxButtonsCar.size());
        Thread.sleep(4000);

        for (int i=0;i<checkBoxButtonsCar.size(); i++){
            checkBoxButtonsCar.get(i).click();
            Thread.sleep(2000);
        }
    }


    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}



