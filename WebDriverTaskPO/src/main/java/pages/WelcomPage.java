package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WelcomPage {

    private static final By FORM_AUTH = By.xpath("//a[@href='/login']");
    private static final By HEADING = By.cssSelector(".heading");

    private final WebDriver driver;

    public WelcomPage(WebDriver driver) {
        this.driver = driver;
    }

    public LoginPage goToFormAuth(){
        driver.findElement(FORM_AUTH).click();
        return new LoginPage(driver);
    }

    public boolean isHeadingDisplayed() {
        WebElement heading = null;
        try {
            heading = driver.findElement(HEADING);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return heading.isDisplayed();
    }
}
