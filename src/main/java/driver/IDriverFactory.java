package driver;

import exeption.DriverNotFindException;
import org.openqa.selenium.WebDriver;

public interface IDriverFactory {
    WebDriver getDriver()throws DriverNotFindException;
}

