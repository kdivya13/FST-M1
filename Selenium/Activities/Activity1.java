package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity1 {
    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/");
        System.out.println("Home Page Title: " + driver.getTitle());
        driver.findElement(By.id("about-link")).click();
        System.out.println("About Us Page Title: "+driver.getTitle());
        driver.close();

    }

}
