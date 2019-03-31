package CommonFunction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseUtil {

    public static WebDriver driver; // Use BaseUtil.driver to call it from another class

    public static void initialise() {
        String browser = "firefox"; // Select browser
        String url = "http://the-internet.herokuapp.com/"; // Select URL

        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
            driver = new ChromeDriver();
        }
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(url);
    }

    @BeforeTest // Used only for seleniumTests package
    public void setupTest() {
        String browser = "firefox"; // Select browser

        if (browser.equalsIgnoreCase("firefox")){
            System.setProperty("webdriver.gecko.driver", "./lib/geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "./lib/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        }
    }

    @AfterTest
    public void teardownTest() {
//        driver.close();
    }
}
