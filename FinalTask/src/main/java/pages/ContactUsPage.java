package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static helper.Locators.get;

public class ContactUsPage {

    private final WebDriver driver;
    private static final String VALUE = "2";
    private static final String MY_FILE = "src/main/resources/myFile.txt";
    private static final By SUBJECT_HEADING_DROPDOWN = get("ContactUsPage.SubjectHeadingDropdown");
    private static final By EMAIL_ADDRESS_INPUT = get("ContactUsPage.EmailAddress");
    private static final By ATTACH_FILE_BUTTON = get("ContactUsPage.AttachFile");
    private static final By MESSAGE_TEXT_AREA = get("ContactUsPage.MessageTextArea");
    private static final By SEND_BUTTON = get("ContactUsPage.SendButton");
    private static final By SUCCESSFULLY_MESSAGE_HEADING = get("ContactUsPage.SuccessfullyMessage");
    private static final By ERROR_MESSAGE = get("ContactUsPage.ErrorMessage");

    public ContactUsPage(WebDriver driver) {
        this.driver = driver;
    }

    public ContactUsPage sendMessage(String email, String textMassage) {

        WebElement optionsSelect = driver.findElement(SUBJECT_HEADING_DROPDOWN);
        Select select = new Select(optionsSelect);
        select.selectByValue(VALUE);
        driver.findElement(EMAIL_ADDRESS_INPUT).sendKeys(email);
        driver.findElement(ATTACH_FILE_BUTTON).sendKeys(MY_FILE);
        driver.findElement(MESSAGE_TEXT_AREA).sendKeys(textMassage);
        driver.findElement(SEND_BUTTON).click();
        return this;
    }

    public boolean isSuccessfullyMessageHeadingDisplayed() {
        WebElement successfullyHeading;
        try {
            successfullyHeading = driver.findElement(SUCCESSFULLY_MESSAGE_HEADING);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return successfullyHeading.isDisplayed();
    }

    public boolean isErrorMassageDisplayed() {
        WebElement errorMassage;
        try {
            errorMassage = driver.findElement(ERROR_MESSAGE);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return errorMassage.isDisplayed();
    }
}