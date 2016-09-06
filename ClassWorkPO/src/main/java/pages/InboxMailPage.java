package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InboxMailPage {

    private static final By LOGO_LINK = By.cssSelector("a.pm-logo__link");

    private final WebDriver driver;

    public InboxMailPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isLogoLinkDisplayed() {
        WebElement logoLink = null;
        try {
            logoLink = driver.findElement(LOGO_LINK);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return logoLink.isDisplayed();
    }
}
