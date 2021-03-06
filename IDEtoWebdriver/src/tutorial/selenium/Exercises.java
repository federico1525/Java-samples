package tutorial.selenium;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Exercises {

    private WebDriver driver;
    private String baseUrl1;
    private String baseUrl2;


    @Before
    public void setUp() throws Exception {
        driver = new FirefoxDriver();
        baseUrl1 = "http://www.expedia.com/";
        baseUrl2 = "http://www.htmlcodetutorial.com/forms/_SELECT_MULTIPLE.html";

        // Maximize the browser's window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void doTest() throws Exception {
        driver.get(baseUrl1);

        Select sel1 = new Select(driver.findElement(By.id("package-1-adults")));
        Select sel2 = new Select(driver.findElement(By.id("package-1-children")));

        // let's print the values
        List<WebElement> options1 = sel1.getOptions();
        List<WebElement> options2 = sel2.getOptions();

        for (int i=0;i<options1.size();i++){
            System.out.println("#### options1 : " + options1.get(i).getText());
        }

        for (int i=0;i<options2.size();i++){
            System.out.println("#### options2 : " + options2.get(i).getText());
        }


        sel1.selectByValue("5");
        Thread.sleep(1000);

        sel2.selectByIndex(2);
        Thread.sleep(2000);
    }

    @Test
    public void doTestMultiselect() throws Exception {
        driver.get(baseUrl2);

        Select sel1 = new Select(driver.findElement(By.name("toppings")));
        // let's print the values
        List<WebElement> options1 = sel1.getOptions();

        for (int i=0;i<options1.size();i++){
            System.out.println("#### options1 : " + options1.get(i).getText());
        }

        sel1.selectByValue("onions");
        sel1.selectByIndex(0);
        sel1.selectByIndex(1);

        sel1.deselectAll();

        sel1.selectByIndex(3);
        sel1.selectByIndex(4);

        sel1.deselectByIndex(3);
        sel1.selectByValue("mushrooms");
        sel1.deselectByValue("olives");

        Thread.sleep(2000);

        driver.findElement(By.xpath(".//*[@id='content']/tbody/tr/td/table[1]/tbody/tr[2]/td[2]/form/p[2]/input")).click();

    }


    @After
    public void closeTest() throws Exception {
        driver.quit();
        Thread.sleep(1000);
    }


}
