package exeption;

public class DriverNotFindException extends Exception {

    public DriverNotFindException(String browser) {
        super(String.format("Browser %s not find", browser));
    }
}
