package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity8 {
    public static void main(String[] args)
    {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        WebDriver driver=new FirefoxDriver();
        driver.navigate().to("https://v1.training-support.net/selenium/dynamic-controls");
        System.out.println(driver.getTitle());
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        //Find the checkbox toggle button and click it.
        WebElement check=driver.findElement(By.className("willDisappear"));
        check.click();
        //click on remove checkbox button
        System.out.println(driver.findElement(By.id("toggleCheckbox")).getText());
       WebElement removeCheckbox= driver.findElement(By.id("toggleCheckbox"));
        removeCheckbox.click();
        //Wait till the checkbox disappears.
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("willDisappear")));
        System.out.println(check.isDisplayed());

        System.out.println(driver.findElement(By.xpath("//button[contains(text(),'Add Checkbox')]")).getText());

        WebElement add=driver.findElement(By.xpath("//button[contains(text(),'Add Checkbox')]"));
        add.click();
          //  Click the button again. Wait till it appears and check the checkbox.
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//button[contains(text(),'Add Checkbox')]")));
        System.out.println(add.isDisplayed());
        driver.close();

    }
}
