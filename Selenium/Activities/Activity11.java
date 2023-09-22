package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11
{
        public static void main(String[] args) {
            System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
            WebDriverManager.firefoxdriver().setup();
            WebDriver driver = new FirefoxDriver();
            WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
            driver.navigate().to("https://v1.training-support.net/selenium/dynamic-controls");
            //printing the text of title
            System.out.println(driver.getTitle());
            // finding the checkbox
            WebElement checkBox1=driver.findElement(By.xpath("//input[@class='willDisappear']"));
           // System.out.println("check before clicking, is checkbox displayed :"+checkBox1.isDisplayed());
            System.out.println("check before clicking, is checkbox selected :"+checkBox1.isSelected());
            checkBox1.click();
            System.out.println("check after clicking, is checkbox selected : "+checkBox1.isSelected());

            //Click on the remove checkbox button
            WebElement removeCheckbox=driver.findElement(By.xpath("//button[contains(text(),'Remove checkbox')]"));
            removeCheckbox.click();

            //wait until checkbox disappears
            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@class='willDisappear']")));
            //System.out.println("check after clicking on remove button is checkbox displayed : "+checkBox1.isDisplayed());

            //Click on Add CheckBox
            WebElement addCheckbox=driver.findElement(By.xpath("//button[contains(text(),'Add Checkbox')]"));
            addCheckbox.click();

            System.out.println("Check after click on Add Checkbox button,check is checkbox apper: "+checkBox1.isDisplayed());

            //close the browser
            driver.close();

        }
}
