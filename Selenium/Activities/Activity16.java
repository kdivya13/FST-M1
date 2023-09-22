package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity16 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.get("https://v1.training-support.net/selenium/dynamic-attributes");
        System.out.println("Dynamic screen page title:" + driver.getTitle());
        //UserName
        WebElement userName = driver.findElement(By.cssSelector("input[class$='-username']"));
        userName.sendKeys("user");
        //Password field
       WebElement passWord=driver.findElement(By.cssSelector("input[class$='-password']"));
        passWord.sendKeys("pass");
        //WebElement confirmPassword=driver.findElement(By.xpath("//input[@type='password']"));
        //confirmPassword.sendKeys("pass");
        WebElement confirmPassword = driver.findElement(By.xpath("//label[text() = 'Confirm Password']/following-sibling::input"));
        WebElement email = driver.findElement(By.xpath("//label[contains(text(), 'mail')]/following-sibling::input"));
        confirmPassword.sendKeys("Password");
        email.sendKeys("real_email@xyz.com");
        //email address
       WebElement emailAddr=driver.findElement(By.xpath("//input[@type='email']"));
        emailAddr.sendKeys("kdivyacse@gmail.com");

        //signup
         driver.findElement(By.xpath("//button[contains(text(),'Sign Up')]")).click();

         //login message
        String loginMessage=driver.findElement(By.id("action-confirmation")).getText();
        System.out.println(loginMessage);
         driver.close();



    }
}