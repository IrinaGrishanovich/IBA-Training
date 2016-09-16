package tests;

import base.TestBase;
import helper.Listener;
import helper.RandomData;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.AccountCreationPage;
import pages.AuthenticationPage;
import pages.HomePage;
import pages.MyAccountPage;

@Listeners(Listener.class)
public class RegisterTest extends TestBase {

    private static final String RANDOM_EMAIL = RandomData.getRandomEmail();
    private static final String FIRST_NAME = RandomData.getRandomText();
    private static final String LAST_NAME = RandomData.getRandomText();
    private static final String PASSWORD = RandomData.getRandomNumber();
    private static final String DAY_OF_BIRTH = RandomData.getRandonDayOfBirth();
    private static final String MONTH_OF_BIRTH = RandomData.getRandonMonthOfBirth();
    private static final String YEAR_OF_BIRTH = RandomData.getRandomYearOfBirth();
    private static final String ADDRESS = RandomData.getRandomText();
    private static final String CITY = RandomData.getRandomText();
    private static final String STATE = "California";
    private static final String POSTAL_CODE = RandomData.getRandomNumber();
    private static final String MOBILE_PHONE = RandomData.getRandomNumber();


    @Test
    public void register() {
        HomePage homePage = new HomePage(driver);
        AuthenticationPage authenticationPage = homePage.goToAuthenticationPage();
        AccountCreationPage accountCreationPage = authenticationPage.createAnAccount(RANDOM_EMAIL);
        MyAccountPage myAccountPage = accountCreationPage.accountCreation(FIRST_NAME, LAST_NAME, PASSWORD, DAY_OF_BIRTH,
                MONTH_OF_BIRTH, YEAR_OF_BIRTH, ADDRESS, CITY, STATE, POSTAL_CODE, MOBILE_PHONE);

        Assert.assertTrue(myAccountPage.isMyAccountHeadingDisplayed(), "My Account heading didn't display");
    }
}
