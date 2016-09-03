package parser;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParserGroupTest { //  этот тест создан для проверки работы группы "parser", вызываемой из файла testng_parser.xml

    @BeforeMethod(alwaysRun = true)
    public void setup() {
        System.out.println("Before Method");
    }

    @Test(groups = "parser")
    public void parserGroupTest() {
        System.out.println("parserGroupTest");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        System.out.println("After Method");
    }
}
