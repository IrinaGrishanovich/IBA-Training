package item;

import org.testng.Assert;
import org.testng.annotations.*;
import shop.RealItem;

public class RealItemTest {

    @BeforeTest(alwaysRun = true)
    public void setup() {
        System.out.println("Before RealItemTest");
    }

    @Test
    public void realItemTest(){
        RealItem car = new RealItem();
        double weightRes = car.doudleWeight(11.1);   // метод doudleWeigh дописала в RealItem.class
        Assert.assertTrue(weightRes == 22.2);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        System.out.println("After RealItemTest");
    }
}
