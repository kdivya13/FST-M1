package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {

    WebDriver driver;

    @BeforeClass
    public void beforeMethod() {
        WebDriverManager.firefoxdriver().setup();
         driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
    }

    @Test
    public void testCase1() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals(title,"Target Practice");
    }
    @Test
    public void testCase2()
    {
        WebElement blackButton=driver.findElement(By.cssSelector("button.black"));
        Assert.assertTrue(blackButton.isDisplayed());
        Assert.assertEquals(blackButton.getText(),"Black");

    }
    @Test(enabled=false)
    public void testcase3()
    {
     String subHeading=driver.findElement(By.className("sub")).getText();
      Assert.assertTrue(subHeading.contains("Practice"));
    }
@Test
    public void testCase4()
{
    throw new SkipException("Skipped test case");
}
@AfterTest
    public void testcase4()
{
    driver.close();
}

}



