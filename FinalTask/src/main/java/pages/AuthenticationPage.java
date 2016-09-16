package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helper.Locators.get;

public class AuthenticationPage {

    private static final By CREATE_AN_ACCOUNT_BUTTON = get("AuthenticationPage.CreateAnAccountButton");
    private static final By EMAIL_ADDRESS_INPUT = get("AuthenticationPage.CreateEmailAddress");


    private final WebDriver driver;

    public AuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public AccountCreationPage createAnAccount(String randomEmail) {
        driver.findElement(EMAIL_ADDRESS_INPUT).sendKeys(randomEmail);
        driver.findElement(CREATE_AN_ACCOUNT_BUTTON).click();
        return new AccountCreationPage(driver);
    }

}
