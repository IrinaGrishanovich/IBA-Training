package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EMailPage {

    private static final By ERROR = By.cssSelector(".b-login__errors"); // не находит вебдрайвер этот элемент, тест падает

            //By.xpath("//div[@class='b-login__errors']");    //и по этим не ищет
            //By.cssSelector("div[class='b-login__errors']");

    private final WebDriver driver;

    public EMailPage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isErrorDisplayed() {
        WebElement error = null;
        try {
            error = driver.findElement(ERROR);
        } catch (NoSuchElementException ex) {
            return false;
        }
        return error.isDisplayed();
    }
}
