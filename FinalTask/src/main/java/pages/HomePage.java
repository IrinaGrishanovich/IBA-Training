package pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static helper.Locators.get;

public class HomePage {

    private static final By CONTACT_US_LINK = get("HomePage.ContactUsLink");
    private static final By SING_IN_LINK = get("HomePage.SingInLink");
    private static final By SEARCH_INPUT = get("HomePage.Search");
    private static final By SEARCH_BUTTON = get("HomePage.SearchButton");

    private final WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public ContactUsPage goToContactUsPage() {
        driver.findElement(CONTACT_US_LINK).click();
        return new ContactUsPage(driver);
    }

    public AuthenticationPage goToAuthenticationPage() {
        driver.findElement(SING_IN_LINK).click();
        return new AuthenticationPage(driver);
    }

    public SearchPage search(String searchItem) {
        driver.findElement(SEARCH_INPUT).sendKeys(searchItem);
        driver.findElement(SEARCH_BUTTON).click();
        return new SearchPage(driver);
    }

}
