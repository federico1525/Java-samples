package tutorial.selenium;

import java.util.Set;
import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;


public class SwitchWindow {
    private WebDriver driver;
    private String baseUrl;




    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl = "http://www.enterprise.com/";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    @Test
    public void testSwitchWindow() throws Exception {
        driver.get(baseUrl);
        driver.findElement(By.xpath(".//table[@id='standardTab']//a[text()='Airport']")).click();

        // Get handle
        String parentHandle = driver.getWindowHandle();

        // Get all handle
        Set<String> handles = driver.getWindowHandles();

        for (String handle: handles) {
            if (!handle.equals(parentHandle)){
                // switch to the new window
                driver.switchTo().window(handle);

                // Click the element - window will close automatically
                driver.findElement(By.xpath(".//*[@id='content']//a[text()='San Francisco, CA']")).click();

                // Switch back to parent window
                driver.switchTo().window(parentHandle);
//                driver.switchTo().defaultContent();
            }
        }
    }

    @After
    public void tearDown() throws Exception{
//        fail("not yet implemented");
    }
}
