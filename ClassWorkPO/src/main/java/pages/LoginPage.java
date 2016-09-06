package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    private static final By usernameLocator = By.id("mailbox__login");
    private static final By passwordLocator = By.id("mailbox__password");
    private static final By loginButtonLocator = By.id("mailbox__auth__button");

    private final WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage typeUsername(String username) {
        driver.findElement(usernameLocator).sendKeys(username);
        return this;
    }

    public LoginPage typePassword(String password) {
        driver.findElement(passwordLocator).sendKeys(password);
        return this;
    }

    public InboxMailPage submitLogin() {
        driver.findElement(loginButtonLocator).click();
        return new InboxMailPage(driver);
    }

    public EMailPage  submitLoginExpectingFailure() {
        driver.findElement(loginButtonLocator).click();
        return new EMailPage(driver);
    }

    public InboxMailPage loginAs(String username, String password){
        typeUsername(username);
        typePassword(password);

        return submitLogin();
    }
}
