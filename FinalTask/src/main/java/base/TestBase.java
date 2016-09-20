package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import webdriver.WebDriverConfiguration;
import java.util.concurrent.TimeUnit;

public class TestBase {

    private static final String DEFAULT_URL = "http://automationpractice.com/index.php";
    protected static final String EMAIL = "test@gmail.com";

    public static WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = WebDriverConfiguration.setLocalDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
        driver.get(DEFAULT_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
