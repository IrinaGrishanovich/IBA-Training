package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helper.Locators.get;


public class AccountCreationPage {


    private final WebDriver driver;
    private static final By GENDER_RADIO_BUTTON = get("AccountCreationPage.GenderRadioButton");
    private static final By FIRST_NAME_INPUT = get("AccountCreationPage.FirstName");
    private static final By LAST_NAME_INPUT = get("AccountCreationPage.LastName");
    private static final By PASSWORD_INPUT = get("AccountCreationPage.Password");
    private static final By DAY_OF_BIRTH_DROPDOWN = get("AccountCreationPage.DayOfBirth");
    private static final By MONTH_OF_BIRTH_DROPDOWN = get("AccountCreationPage.MonthOfBirth");
    private static final By YEAR_OF_BIRTH_DROPDOWN = get("AccountCreationPage.YearOfBirth");
    private static final By ADDRESS_INPUT = get("AccountCreationPage.Address");
    private static final By CITY_INPUT = get("AccountCreationPage.City");
    private static final By STATE_DROPDOWN = get("AccountCreationPage.State");
    private static final By POSTAL_CODE_INPUT = get("AccountCreationPage.Postcode");
    private static final By MOBILE_PHONE_INPUT = get("AccountCreationPage.MobilePhone");
    private static final By REGISTER_BUTTON = get("AccountCreationPage.RegisterButton");

    public AccountCreationPage(WebDriver driver) {
        this.driver = driver;
    }

    public MyAccountPage accountCreation(String firstName, String lastName, String password, String dayOfBirth,
                                         String monthOfBirth, String yearOfBirth, String address, String city,
                                       String state, String postalCode, String mobilePhone) {
        driver.findElement(GENDER_RADIO_BUTTON).click();
        driver.findElement(FIRST_NAME_INPUT).sendKeys(firstName);
        driver.findElement(LAST_NAME_INPUT).sendKeys(lastName);
        driver.findElement(PASSWORD_INPUT).sendKeys(password);

        driver.findElement(DAY_OF_BIRTH_DROPDOWN).sendKeys(dayOfBirth);
        driver.findElement(MONTH_OF_BIRTH_DROPDOWN).sendKeys(monthOfBirth);
        driver.findElement(YEAR_OF_BIRTH_DROPDOWN).sendKeys(yearOfBirth);

        driver.findElement(ADDRESS_INPUT).sendKeys(address);
        driver.findElement(CITY_INPUT).sendKeys(city);
        driver.findElement(STATE_DROPDOWN).sendKeys(state);
        driver.findElement(POSTAL_CODE_INPUT).sendKeys(postalCode);
        driver.findElement(MOBILE_PHONE_INPUT).sendKeys(mobilePhone);
        driver.findElement(REGISTER_BUTTON).click();
        return new MyAccountPage(driver);
    }
}
