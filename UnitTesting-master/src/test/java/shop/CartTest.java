package shop;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CartTest {

    @BeforeTest(alwaysRun = true)
    public void setup() {
        System.out.println("Before CartTest");
    }

    @Test
    public void cartTest(){
        Cart victoriaCart = new Cart("victoria-cart");
        RealItem car2 = new RealItem();
        car2.setPrice(22000.3);
        victoriaCart.addRealItem(car2);
        double RealItemPriceRes = victoriaCart.getRealItemPrice();

        Assert.assertTrue(RealItemPriceRes == 22000.3);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        System.out.println("After CartTest");
    }
}
