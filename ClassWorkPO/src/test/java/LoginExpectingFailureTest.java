import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EMailPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginExpectingFailureTest {

    private static final String DEFAULT_URL = "https://mail.ru/";

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get(DEFAULT_URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginExpectingFailureTest(){
        LoginPage loginPage = new LoginPage(driver);
        EMailPage eMailPage = loginPage.submitLoginExpectingFailure();

        Assert.assertTrue(eMailPage.isErrorDisplayed(), "Element not found");
    }
}
