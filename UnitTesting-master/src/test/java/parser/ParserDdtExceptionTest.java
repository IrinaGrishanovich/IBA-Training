package parser;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;

public class ParserDdtExceptionTest {

    @DataProvider
    public Object[][] invalidFilesProvider() {
        return new Object[][]{
                new Object[]{"src/main/resources/andrew-cart1.json"},
                new Object[]{"src/main/resources/eugen-cart1.json"},
                new Object[]{"src/main/resources/anni-cart1.json"},
                new Object[]{"src/main/resources/victoria-cart1.json"}
        };
    }

    @Test(expectedExceptions = FileNotFoundException.class, dataProvider = "invalidFilesProvider")
    public void jsonParserExceptionTest(String nameOfFile) {
        JsonParser parser = new JsonParser();
        parser.readFromFile(new File(nameOfFile));
    }

}
