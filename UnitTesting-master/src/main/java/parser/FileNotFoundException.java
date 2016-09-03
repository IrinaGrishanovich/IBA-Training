package parser;

public class FileNotFoundException extends RuntimeException {

    public FileNotFoundException() {
        super();                    //обращение к конструктору родительского класса RuntimeException
    }

    public FileNotFoundException(String message) {
        super(message);             //обращение к конструктору родительского класса RuntimeException
    }
}
