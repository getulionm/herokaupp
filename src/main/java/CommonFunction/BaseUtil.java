package CommonFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseUtil {

    public static WebDriver driver; // Add public static to make it global

    @BeforeTest // USed only for seleniumTests package
    public void setupTest() {
        System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterTest
    public void teardownTest() {
        driver.close();
    }

    public static void initialise() {
        System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }
}
