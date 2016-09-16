package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;


public class WebDriverConfiguration {

    public static WebDriver setLocalDriver() {
        WebDriver driver;
        String br = System.getProperty("browser") == null ? "firefox" : System.getProperty("browser");
        switch (br) {
            case "chrome":
                driver = new ChromeDriver();
                break;
            default:
                driver = new FirefoxDriver();
                break;
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        return driver;
    }
}
