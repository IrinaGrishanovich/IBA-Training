import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.InboxMailPage;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;
/*
Mail.ru
1. Ссылка на "Игры" в хэдере css = [href="https://r.mail.ru/n214942163?sz=39&rnd=13929581"]>.x-ph__link__text
                             xpath=//div[@id='portal-headline']/table/tbody/tr/td//a[contains(@href, "https://r.mail.ru/n214942163?sz=39&rnd=13929581")]

2. Ссылка на "Игры" под полем поиска  css = a.news__tabs__item__link[name="clb683645"]
                                      xpath= //div[@id='news']/div/table/tbody/tr//td/a[@name="clb683645"]

Залогиниться seleniumtests10; 060788avavav

1. Кнопка "Написать письмо" css = a[data-title="Написать письмо (N)"]
                            xpath= //a[@data-title="Написать письмо (N)"]

2. Кнопка "Удалить" css = div[data-title="Удалить (Cmd+Backspace)"]
                    xpath= //div[@data-title="Удалить (Cmd+Backspace)"]

3. Кнопка "Спам"   css = [data-name="spam"][data-title="Спам (J)"]
                   xpath= //div[@data-name="spam"]

4. Ссылка "Входящие"    css = a[href="/messages/inbox/"]>span[class="b-nav__item__text"]
                        xpath = //a[@href="/messages/inbox/"]/span[@class="b-nav__item__text"]

5. Ссылка "Отправленные" css = a[href="/messages/sent/"]>span[class="b-nav__item__text"]
                         xpath = //a[@href="/messages/sent/"]/span[@class="b-nav__item__text"]
Нажать Написать письмо

1. Инпут на тему    css = input[class="b-input"]
                    xpath =//input[@class="b-input"]

2. Инпут на адресата css = div[data-blockid="compose_to"]
                     xpath =//div[@data-blockid="compose_to"]

3. Ссылка на Ваше фото справа(в профиле) css = .x-ph__auth_list__item__avatar
                                         xpath = //a[@class="x-ph__auth_list__item__avatar__camera x-ph-ico x-ph-ico_camera"]

4. Ссылка на кнопку жирного шрифта  css = span[class="mceIcon mce_bold"]
                                    xpath = //span[@class="mceIcon mce_bold"]
 */


public class LoginTest {

    private static final String DEFAULT_URL = "https://mail.ru";
    private static final String username = "seleniumtests10";
    private static final String password = "060788avavav";

    private WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.MILLISECONDS);
        driver.get(DEFAULT_URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(driver);
        InboxMailPage inboxMailPage =loginPage.loginAs(username, password);

        Assert.assertTrue(inboxMailPage.isLogoLinkDisplayed(), "Logo link is not displayed!");

    }
}
