package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity15 {
    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver=new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Dynamic screen page title:"+driver.getTitle());
        //Username
        WebElement userName=driver.findElement(By.xpath("//input[starts-with(@class, 'username-')]"));
        //password
        WebElement password=driver.findElement(By.xpath("//input[starts-with(@class,'password-')]"));
        userName.sendKeys("admin");
        password.sendKeys("password");
        driver.findElement(By.xpath("//button[contains(text(),'Log in')]")).click();
        System.out.println("login message after cick on login button: "+driver.findElement(By.id("action-confirmation")).getText());
            //close the browser
        driver.close();
    }
}
