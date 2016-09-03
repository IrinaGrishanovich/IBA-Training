import parser.JsonParser;
import shop.*;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        Cart andrewCart = new Cart("andrew-cart"); // andrew-cart

        RealItem car = new RealItem();
        car.setName("Audi");
        car.setPrice(32026.9);
        car.setWeight(1560);

        VirtualItem disk = new VirtualItem();
        disk.setName("Windows");
        disk.setPrice(11);
        disk.setSizeOnDisk(20000);

        andrewCart.addRealItem(car);
        andrewCart.addVirtualItem(disk);
        andrewCart.showItems();

        JsonParser parser = new JsonParser();
        parser.writeToFile(andrewCart);


        Cart victoriaCart = new Cart("victoria-cart"); // victoria-cart дописала для тренировки

        RealItem car2 = new RealItem();
        car2.setName("Mazda");
        car2.setPrice(22000.3);
        car2.setWeight(1000);

        VirtualItem disk2 = new VirtualItem();
        disk2.setName("Linux");
        disk2.setPrice(22);
        disk2.setSizeOnDisk(23000);

        victoriaCart.addRealItem(car2);
        victoriaCart.addVirtualItem(disk2);
        victoriaCart.showItems();

        JsonParser parser2 = new JsonParser();
        parser2.writeToFile(victoriaCart);


        Cart eugenCart = parser.readFromFile(new File("src/main/resources/eugen-cart.json")); // eugen-cart
        eugenCart.showItems();


        Cart annaCart = parser.readFromFile(new File("src/main/resources/anni-cart.json")); // anni-cart
        annaCart.showItems();

    }
}
