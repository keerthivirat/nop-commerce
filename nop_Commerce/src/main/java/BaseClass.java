import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BaseClass {

    WebDriver driver;


    public BaseClass(WebDriver driver){
         this.driver=driver;


    }
    public void click(By locator){
        driver.findElement(locator).click();
    }
    public void Sendkeys(By locator,String text){
        driver.findElement(locator).sendKeys(text);
    }
}
