package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4 {
    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/target-practice");
       System.out.println(driver.getTitle());
//Find the 3rd header on the page and print it's text to the console.
        System.out.println(driver.findElement(By.xpath("//h3[@class='ui yellow header']")).getText());
        System.out.println(driver.findElement(By.xpath("//h5[@class='ui green header']")).getCssValue("color"));
        System.out.println(driver.findElement(By.cssSelector(".ui.violet.button")).getAttribute("class"));
       System.out.println(driver.findElement(By.xpath("//button[text()='Grey']")).getText());

        driver.close();



    }
}
