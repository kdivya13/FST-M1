package Activities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity7 {
    public static void main(String[] args) {
        System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
        WebDriverManager.firefoxdriver().setup();
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://v1.training-support.net/selenium/drag-drop");
        Actions builder = new Actions(driver);
        System.out.println(driver.getTitle());
        //Find the ball and simulate a click and drag to move it into "Dropzone 1"
        WebElement football=driver.findElement(By.id("draggable"));
        WebElement dropzone1=driver.findElement(By.id("droppable"));
        WebElement dropzone2=driver.findElement(By.id("dropzone2"));
             builder.clickAndHold(football).moveToElement(dropzone1).pause(2000).release().build().perform();
             builder.dragAndDrop(football,dropzone2).build().perform();
             driver.close();
    }
}
