package test;
/*Определить xpath и css локаторы для следующих элементов на сайте iba.by (ответ записывать следующим образом:
        а) css=.cl; xpath=//div[@class=’cl’] и т.д.):

a) Поисковое поле сверху        css= div#wrapjqiho>.top-search_input
                                xpath= //div[@id="wrapjqiho"]/input[contains(@class, 'top-search_input')]

b) Картинка логотипа IBA сверху css= .logo>img
                                xpath= //html/body/header/div/a/img

c) Картинку для facebook снизу  css= .social_link>img[src="/images/social/fb.png"]
                                xpath= //html/body/footer/div[2]/div[2]/ul/li[2]/a/img

d) Ссылку для facebook снизу    css= a[href="https://www.facebook.com/IBAGroup"]
                                xpath= //a[contains(@href, "https://www.facebook.com/IBAGroup")]

e) Ссылку для Карта сайта       css= .copyright_links>li>a[href="/sitemap/"]
                                xpath= //html/body/footer/div[2]/div[1]/ul/li[1]/a

f) Ссылку для Обратная связь    css= .copyright_links>li>a[href="/contacts/feedback/"]
                                xpath= //html/body/footer/div[2]/div[1]/ul/li[2]/a
*/

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class RedirectToSiteTest {

    @Test
    public void redirectToSite(){
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://the-internet.herokuapp.com");

        Assert.assertTrue(driver.findElement(By.cssSelector(".heading")).isDisplayed());
        driver.quit();
    }


}
