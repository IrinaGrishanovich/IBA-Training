package item;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import shop.VirtualItem;


public class VirtualItemTest {

    @BeforeTest(alwaysRun = true)
    public void setup() {
        System.out.println("Before VirtualItemTest");
    }

    @Test
    public void reaiItemTest() {
        VirtualItem disk = new VirtualItem();   //тестировала метод getSizeOnDisk(), насколько верно тестировать геттер?
        disk.setSizeOnDisk(222.3);              // или надо было дописать методы в VirtualItem.class и уже их тестировать?
        double sizeOnDiskRes = disk.getSizeOnDisk();
        Assert.assertTrue(sizeOnDiskRes == 222.3);
    }

    @AfterTest(alwaysRun = true)
    public void tearDown() {
        System.out.println("After VirtualItemTest");
    }
}

