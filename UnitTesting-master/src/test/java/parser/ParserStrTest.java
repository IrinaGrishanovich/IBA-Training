package parser;

import org.testng.Assert;
import org.testng.annotations.Test;
import shop.Cart;

import java.io.File;

public class ParserStrTest {

    @Test(groups = "parser")
    public void jsonParserStrTest() {

        Object[] obj = {"eugen-cart", 1400.0, 22103.9, 8500.0, 26560.68};
        JsonParser parser = new JsonParser();
        Cart eugenCart = parser.readFromFile(new File("src/main/resources/eugen-cart.json"));

        String cartNameRes = eugenCart.getCartName();
        double weightRes = eugenCart.getWeight();
        double priceRes = eugenCart.getRealItemPrice();
        double sizeOnDiskRes = eugenCart.getSizeOnDisk();
        double totalRes = eugenCart.getTotalPrice();

        Object[] objRes = {cartNameRes, weightRes, priceRes, sizeOnDiskRes, totalRes};

        Assert.assertEquals(obj, objRes);
    }
}
