package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity3 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        //Open a new browser to https://v1.training-support.net
        driver.get("https://v1.training-support.net");
        //Get the title of the page and print it to the console.
        System.out.println(driver.getTitle());

    }
}
