package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.WelcomPage;

import java.util.concurrent.TimeUnit;

public class RedirectToFormAuthTest {

    private static final String DEFAULT_URL = "http://the-internet.herokuapp.com";
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get(DEFAULT_URL);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void redirectToFormAuth(){
        WelcomPage welcomPage = new WelcomPage(driver);
        welcomPage.goToFormAuth();
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.isLoginHeadingDisplayed());
    }
}
