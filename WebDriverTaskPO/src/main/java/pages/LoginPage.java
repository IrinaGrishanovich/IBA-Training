package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class LoginPage {

    private static final By USERNAME_INPUT = By.id("username");
    private static final By PASSWORD_INPUT = By.id("password");
    private static final By LOGIN_BUTTON = By.cssSelector(".radius");
    private static final By LOGIN_HEADING = By.cssSelector(".e xample>h2");
    private static final By FLASH_ERROR = By.cssSelector("#flash.error");


    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public SecureAreaPage login(String username, String password) {
        driver.findElement(USERNAME_INPUT).sendKeys(username);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);
        driver.findElement(LOGIN_BUTTON).click();

        return new SecureAreaPage(driver);
    }

    public boolean isLoginHeadingDisplayed() {
        WebElement loginHeading = null;
        try {
            loginHeading = driver.findElement(LOGIN_HEADING);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return loginHeading.isDisplayed();
    }

    public boolean isFlashErrorDisplayed() {
        WebElement flashError = null;
        try {
            flashError = driver.findElement(FLASH_ERROR);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return flashError.isDisplayed();
    }
}



