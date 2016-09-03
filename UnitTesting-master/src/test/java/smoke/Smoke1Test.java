package smoke;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Smoke1Test {  //тесты в папке Smoke для проверки работы файла testng_smoke.xml

    @BeforeClass(alwaysRun = true)
    public void beforeClassSetup() {
        System.out.println("Before smokeTest1 Class");
    }

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        System.out.println("Before Method");
    }

    @Test(groups="smoke")
    public void smoke1Test() {
        System.out.println("smoke1Test");
    }

    @Test(groups="excl")
    public void exclTest1() {
        System.out.println("exclTest1");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("After Method");
    }
}
