package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WelcomPage;

import java.util.concurrent.TimeUnit;

public class RedirectToSiteTest {

    private static final String DEFAULT_URL = "http://the-internet.herokuapp.com";
    private WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void redirectToSite(){
        driver.get(DEFAULT_URL);
        WelcomPage welcomPage = new WelcomPage(driver);

        Assert.assertTrue(welcomPage.isHeadingDisplayed());
    }
}
