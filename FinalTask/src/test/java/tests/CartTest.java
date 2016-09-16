package tests;

import base.TestBase;
import helper.Listener;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SearchPage;
import ru.yandex.qatools.allure.annotations.TestCaseId;

@Listeners(Listener.class)
public class CartTest extends TestBase {

    private static final String ITEM_FOR_ADDING = "Casual Dresses";

    @TestCaseId("E-4")
    @Test
    public void addAndDeleteItemsFromCart() throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = homePage.search(ITEM_FOR_ADDING);
        searchPage.addRandomItem();
        searchPage.closeWindow();

        SoftAssert softAssert = new SoftAssert();
        softAssert.assertTrue(searchPage.isItemInCartDisplayed(), "The item in cart didn't displayed");

        searchPage.deleteItemFromCart();
        softAssert.assertTrue(searchPage.isEmptyCartDisplayed(), "The cart is full!");

        softAssert.assertAll();

    }
}
