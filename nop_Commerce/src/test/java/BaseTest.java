import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {

    WebDriver driver;

    String URL= "https://demo.nopcommerce.com/";

    @Parameters("browser")
    @BeforeTest
    public void launchapp(String browser) {

        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "D:\\USERFILESDONTDELETE\\Desktop\\nop_Commerce\\drivers\\chromedriver_win32 (4)\\chromedriver.exe");
            driver = new ChromeDriver();
            driver.get(URL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "D:\\USERFILESDONTDELETE\\Desktop\\nop_Commerce\\drivers\\geckodriver-v0.32.2-win32\\geckodriver.exe");
            driver = new FirefoxDriver();
            driver.get(URL);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        } else {
            throw new IllegalArgumentException("The browser type is undefined");
        }

    }
    @AfterTest
    public void teardown(){
        driver.close();
    }


}
