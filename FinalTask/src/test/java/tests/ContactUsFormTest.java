package tests;

import base.TestBase;

import helper.Listener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.ContactUsPage;
import pages.HomePage;
import ru.yandex.qatools.allure.annotations.Features;
import ru.yandex.qatools.allure.annotations.Stories;
import ru.yandex.qatools.allure.annotations.TestCaseId;


@Listeners(Listener.class)
public class ContactUsFormTest extends TestBase {

    private static final String TEXT_MASSAGE = "Text is sent successfully!";
    private static final String EMPTY_MASSAGE = "";

    @TestCaseId("E-1")
    @Features("ContactUsForm")
    @Stories("Verify the visibility of message heading on ContactUsPage")
    @Test
    public void sendMessage() {
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = homePage.goToContactUsPage();
        contactUsPage.sendMessage(EMAIL, TEXT_MASSAGE);

        Assert.assertTrue(contactUsPage.isSuccessfullyMessageHeadingDisplayed(), "Successfully message heading of contactUsPage didn't appear");
    }

    @TestCaseId("E-2")
    @Features("ContactUsForm")
    @Stories("Verify the visibility of message heading on ContactUsPage")
    @Test
    public void sendEmptyMassage() {
        HomePage homePage = new HomePage(driver);
        ContactUsPage contactUsPage = homePage.goToContactUsPage();
        contactUsPage.sendMessage(EMAIL, EMPTY_MASSAGE);

        Assert.assertTrue(contactUsPage.isErrorMassageDisplayed(), "The message cannot be blank on contactUsPage didn't appear");
    }
}
