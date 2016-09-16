package webdriver;

import org.openqa.selenium.WebDriver;

public class Driver {
    //cинглтоном создать инстанс драйвер, и в любом месте дергать этот геттер
    //тут вызывать создание драйвера
    private static Driver driver;  //для getInstance()
    public WebDriver webDriver;

    private Driver() {
        webDriver = WebDriverConfiguration.setLocalDriver();
    }

    public static Driver getInstance() {
        if (driver == null) {
            driver = new Driver();
        }
        return driver;
    }
}
