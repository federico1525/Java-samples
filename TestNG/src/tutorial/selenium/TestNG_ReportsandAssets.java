package tutorial.selenium;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

/**
 * Created by fede on 3/29/15.
 */
public class TestNG_ReportsandAssets {
    @Test
    public void testString(){
        String actualValue = "Test Reporters and Assert";
        Reporter.log("Actual value is " + actualValue, true);
        Assert.assertEquals(actualValue, "Test Reporters and Asserts");
        Reporter.log("Verifying the actual value with expected value", true);
        Reporter.log("");

    }

    @Test
    public void testInt(){
        int actualInt = 10;
        Reporter.log("The actual value is " + actualInt, true);
        Assert.assertEquals(actualInt, 10);
        Reporter.log("Verifying the actual value with expected value", true);
    }

    @Test
    public void testArray(){
        int[] actualArray = {1, 2, 3};
        int[] expectedArray = {1, 2, 3};
        Reporter.log("actual array is : " + actualArray, true);
        Assert.assertEquals(actualArray, expectedArray);
        Reporter.log("verifying the expected array" , true);
        Reporter.log("");
    }
}
