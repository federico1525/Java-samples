package tutorial.selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Exercises2 {
    private WebDriver driver;
    private String baseUrl;
    private String baseUrl2;

    @Before
    public void setup(){
        driver = new FirefoxDriver();
        baseUrl = "http://dhtmlx.com/docs/products/dhtmlxGrid/";
        baseUrl2 = "http://www.dhtmlx.com/docs/products/dhtmlxTree/";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void test() throws Exception{
        driver.get(baseUrl);

        WebElement aboutus = driver.findElement(By.linkText("About us"));
        Actions azione = new Actions(driver);
        azione.moveToElement(aboutus).build().perform();
        WebElement services = driver.findElement(By.linkText("Services"));
        azione.moveToElement(services).build().perform();
        Thread.sleep(3000);

        WebElement home = driver.findElement(By.linkText("DHTMLX"));
        home.click();
        Thread.sleep(1000);
    }

    @Test
    public void draganddrop() throws Exception{
        driver.get(baseUrl2);
        Thread.sleep(2000);

        Actions action = new Actions(driver);

        WebElement fromElement = driver.findElement(By.xpath(".//*[@id='treebox1']//span[text()='James Johns']"));
        WebElement toElement = driver.findElement(By.xpath(".//*[@id='treebox2']//span[text()='History']"));

        action.dragAndDrop(fromElement, toElement).build().perform();

        WebElement click = driver.findElement(By.xpath(".//*[@id='treebox2']/div/table/tbody/tr[2]/td[2]/table/tbody/tr[4]/td[2]/table/tbody/tr[1]/td[1]/div"));
        click.click();
        WebElement fromElement2 = driver.findElement(By.xpath(".//*[@id='treebox2']//span[text()='Stephen King']"));
        WebElement toElement2 = driver.findElement(By.xpath(".//*[@id='treebox1']//span[text()='Bestsellers']"));
        action.clickAndHold(fromElement2).moveToElement(toElement2).release().build().perform();
    }

    @After
    public void endTest(){
        driver.quit();
    }
}