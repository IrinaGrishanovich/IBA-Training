package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

public class FormAuthenticationTest {

    @Test
    public void formAuthentication(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com");
        driver.findElement(By.xpath("//*[@id='content']/ul/li[18]/a")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector(".radius")).isDisplayed());
        driver.quit();
    }
}
