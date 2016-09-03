package parser;

import shop.Cart;

import java.io.File;

public interface Parser {   //Интерфейс - совокупность методов и правил взаимодействия системы, определяет как элементы
                            //будут взаимодействовать м/у собой. Может содержать только константы, сигнатуры методов и
                            // вложенные типы
    void writeToFile(Cart cart);  // метод в классе JsonParser
    Cart readFromFile(File file); // метод в классе JsonParser

}
