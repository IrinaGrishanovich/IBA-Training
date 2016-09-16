package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helper.Locators.get;


public class MyAccountPage {

    private static final By MY_ACCOUNT_HEADING = get("MyAccountPage.MyAccountHeading");
    private final WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMyAccountHeadingDisplayed() {
        WebElement myAccountHeading = null;
        try {
            myAccountHeading = driver.findElement(MY_ACCOUNT_HEADING);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return myAccountHeading.isDisplayed();
    }

}
