package smoke;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Smoke2Test {

    @BeforeClass(alwaysRun = true)
    public void beforeClassSetup() {
        System.out.println("Before smoke2Test Class");
    }

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        System.out.println("Before Method");
    }

    @Test(groups = "smoke")
    public void smoke2Test() {
        System.out.println("smoke2Test");
    }

    @Test(groups = "excl")
    public void exclTest2() {
        System.out.println("exclTest2");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("After Method");
    }
}
