package tests;

import base.TestBase;
import helper.Listener;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.SearchPage;
import ru.yandex.qatools.allure.annotations.TestCaseId;

@Listeners(Listener.class)
public class SearchTest extends TestBase {

    private static final String SEARCH_ITEM = "Blouse";

    @TestCaseId("E-3")
    @Test
    public void search() {
        HomePage homePage = new HomePage(driver);
        SearchPage searchPage = homePage.search(SEARCH_ITEM);

        Assert.assertTrue(searchPage.isSearchResultDisplayed(SEARCH_ITEM), "The search result didn't display");
    }
}
