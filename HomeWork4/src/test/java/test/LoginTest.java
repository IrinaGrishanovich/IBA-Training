package test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void login(){

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("tomsmith");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".radius")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("#flash.success")).isDisplayed());
        driver.quit();  // если тест падает, то Firefox почему-то не закрывается
    }

    // если я ввожу неправильный username или при правильном логине, то появляются разные сообщения вверху,
    // но во всех случаях у них уникальный css=#flash одинаковый, а как можно проверить именно
    // текст на этом элементе (innerText " Your username is invalid!\n×", innerText "  You logged ...cure area!\n")


    @Test
    public void invalidUsername() {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).sendKeys("username");
        driver.findElement(By.id("password")).sendKeys("SuperSecretPassword!");
        driver.findElement(By.cssSelector(".radius")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("#flash.error")).isDisplayed());
        driver.quit();
    }

    @Test
    public void emptyFields() {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(11, TimeUnit.SECONDS);

        driver.get("http://the-internet.herokuapp.com/login");
        driver.findElement(By.id("username")).click();
        driver.findElement(By.id("password")).click();
        driver.findElement(By.cssSelector(".radius")).click();

        Assert.assertTrue(driver.findElement(By.cssSelector("#flash.error")).isDisplayed());
        driver.quit();
    }

}
