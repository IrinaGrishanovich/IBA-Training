package parser;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import shop.Cart;
import java.io.File;

public class ParserInvalidDataExeptionTest {

    @DataProvider
    public Object[][] invalidDataProvider() {
        return new Object[][]{
                 new Object[]{"andrew", 1000.0, 3333.3, 5454.6, 676.0}, //подаю на вход невалидные данные
                 new Object[]{"eugen", 200.0, 444.4, 342.0, 221.0}
        };
    }

// а вот тут я так и не смогда выявить конкретную ошибку, какую надо отловить.
// Пыталась класс с ошибкой создать, не заработало. Написала вообщем (AssertionError.class)- думаю это не верно

    @Test(expectedExceptions = AssertionError.class, dataProvider = "invalidDataProvider")
    public void jsonParserinvalidDataTest(String cartName, double weight, double price, double sizeOnDisk, double total) {

        Object[] obj = {cartName, weight, price, sizeOnDisk, total};
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
