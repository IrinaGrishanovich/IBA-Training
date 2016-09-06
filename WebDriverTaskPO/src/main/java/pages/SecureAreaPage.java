package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SecureAreaPage {

    private static final By FLASH_SUCCESS = By.cssSelector("#flash.success");

    private WebDriver driver;

    public SecureAreaPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isFlashSuccDisplayed() {
        WebElement flashSacc = null;
        try {
            flashSacc = driver.findElement(FLASH_SUCCESS);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return flashSacc.isDisplayed();
    }
}
