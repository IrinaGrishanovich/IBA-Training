package pages;


import helper.RandomData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static helper.Locators.get;


public class SearchPage {

    private final WebDriver driver;

    private static final By PRODUCT_NAME_TITLE = get("SearchPage.ProductName");
    private static final By PRODUCT_CONTAINER = get("SearchPage.ProductContainer");
    private static final By ADD_BUTTON = get("SearchPage.AddToCartButton");
    private static final By CLOSE_WINDOW_CROSS = get("SearchPage.CloseWindowCross");
    private static final By CART_BLOCK_PRODUCT_NAME_LINK = get("SearchPage.CartBlockProductNameLink");
    private static final By SHOPPING_CART_LINK = get("SearchPage.ShoppingCartLink");
    private static final By CART_BLOCK_REMOVE_LINK = get("SearchPage.CartBlockRemoveLink");
    private static final By EMPTY_CART_LINK = get("SearchPage.EmptyCartLink");
    public String titleRandomItem;

    public SearchPage(WebDriver driver) {
        this.driver = driver;
    }
//
//    public boolean verifySearchResult(String item) {
//        return driver.findElement(PRODUCT_NAME_TITLE).getAttribute("title").contains(item);

    public boolean isSearchResultDisplayed(String item) {
        WebElement searchResult;
        try {
            searchResult = driver.findElement(PRODUCT_NAME_TITLE);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return searchResult.getAttribute("title").contains(item);
    }

    public void addRandomItem() {
        List<WebElement> listSearchItem = driver.findElements(PRODUCT_CONTAINER);
        int allSearchItems = listSearchItem.size();
        int numberRandomItem = RandomData.getRandomSearchItem(allSearchItems);
        WebElement randomItem = listSearchItem.get(numberRandomItem);
        titleRandomItem = randomItem.getAttribute("title");

        Actions builder = new Actions(driver);
        builder.moveToElement(randomItem).perform();
        driver.findElement(ADD_BUTTON).click();
    }

    public void closeWindow() {
        driver.findElement(CLOSE_WINDOW_CROSS).click();
    }

    public boolean isItemInCartDisplayed() {
        WebElement shoppingCart = driver.findElement(SHOPPING_CART_LINK);
        Actions actions = new Actions(driver);
        actions.moveToElement(shoppingCart).build().perform();

        WebElement searchResult;
        try {
            searchResult = driver.findElement(CART_BLOCK_PRODUCT_NAME_LINK);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return searchResult.getAttribute("title").contains(titleRandomItem);
    }

    public void deleteItemFromCart() {
        WebElement shoppingCart = driver.findElement(SHOPPING_CART_LINK);
        Actions actions = new Actions(driver);
        actions.moveToElement(shoppingCart).build().perform();
        driver.findElement(CART_BLOCK_REMOVE_LINK).click();

    }

    public boolean isEmptyCartDisplayed() {
        WebElement shoppingCart = driver.findElement(SHOPPING_CART_LINK);
        Actions actions = new Actions(driver);
        actions.moveToElement(shoppingCart).build().perform();

        WebElement emptyCart;
        try {
            emptyCart = driver.findElement(EMPTY_CART_LINK);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return emptyCart.isDisplayed();
    }


}

