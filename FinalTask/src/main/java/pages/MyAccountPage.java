package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static helper.Locators.get;

public class MyAccountPage {

    private static final By MY_INFO_ACCOUNT = get("MyAccountPage.InfoAccount");
    private final WebDriver driver;

    public MyAccountPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isMyInfoAccountDisplayed() {
        WebElement myInfoAccount;
        try {
            myInfoAccount = driver.findElement(MY_INFO_ACCOUNT);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return myInfoAccount.isDisplayed();
    }
}
