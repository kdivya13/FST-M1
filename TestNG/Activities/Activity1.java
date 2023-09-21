package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity1
{
WebDriver driver;
        @BeforeMethod
        public void BeforeMethod()
        {
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net");
        }
        @Test
        public void exampleTestcase()
        {
           String Title=driver.getTitle();
           System.out.println("Title of the Page is: "+Title);
            Assert.assertEquals("Training Support ", Title);
            driver.findElement(By.id("about-link")).click();
            String newTitle=driver.getTitle();
            System.out.println("NewTitle of the Page is: "+newTitle);
            Assert.assertEquals(driver.getTitle(),newTitle);

        }
        @AfterMethod
        public void AfterMethod()
        {
                driver.close();
        }
    }




