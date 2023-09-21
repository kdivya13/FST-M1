package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3
{
WebDriver driver;
    @BeforeClass
    public void testcase1()
    {
        WebDriverManager.firefoxdriver().setup();
        driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/login-form");

    }
    @Test
    public void testcase2()
    {
        WebElement UserName=driver.findElement(By.id("username"));
        WebElement PassWord=driver.findElement(By.id("password"));
        UserName.sendKeys("admin");
        PassWord.sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();

       String message=driver.findElement(By.id("action-confirmation")).getText();
        Assert.assertEquals("Welcome Back, admin",message);

    }
    @AfterClass
    public void testcase3()
    {
        driver.close();
    }
}
