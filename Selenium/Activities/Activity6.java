package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity6
{
    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver=new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/input-events");
        Actions builder=new Actions(driver);
        System.out.println(driver.getTitle());
        //Press the key of first letter of your name in caps
        builder.sendKeys("D").build().perform();
        //Press CTRL+a and the CTRL+c to copy all the text on the page.
        //(Paste the text in a text editor to verify results.)
        builder.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();

        driver.close();
        //Close the browser.

    }
}
