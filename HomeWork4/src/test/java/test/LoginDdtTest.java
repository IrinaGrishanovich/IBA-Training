package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class LoginDdtTest {
    private WebDriver driver;

    @DataProvider
    public Object[][] loginDdtDataProvider() {
        return new Object[][]{
                 new Object[]{ "tomsmith", "SuperSecretPassword!", "#flash.success" },
                 new Object[]{ "username", "SuperSecretPassword!", "#flash.error" },
                 new Object[]{ "", "", "#flash.error" }
        };
    }

    @Test(dataProvider = "loginDdtDataProvider")
    public void loginToGmailTest(String username, String password, String selector) {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password);
        driver.findElement(By.cssSelector(".radius")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector(selector)).isDisplayed());
        driver.quit();
    }
}
