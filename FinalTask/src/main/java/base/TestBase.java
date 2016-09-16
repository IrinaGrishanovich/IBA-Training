package base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import webdriver.Driver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    private static final String DEFAULT_URL = "http://automationpractice.com/index.php";
    protected static final String EMAIL = "test@gmail.com";

    protected WebDriver driver;

    @BeforeTest
    public void setup() {
        driver = Driver.getInstance().webDriver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(DEFAULT_URL);
    }

    @AfterTest
    public void tearDown() {
        driver.quit();
    }
}
