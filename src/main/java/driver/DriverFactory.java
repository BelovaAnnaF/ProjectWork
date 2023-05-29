package driver;

import exeption.DriverNotFindException;
import org.openqa.selenium.WebDriver;

public class DriverFactory implements IDriverFactory {
      private String browserType = System.getProperty("browser").toLowerCase();

    @Override
    public WebDriver getDriver() throws DriverNotFindException {
        switch (this.browserType) {
            case "chrome": {
                return new ChromeWebDriver().newDriver();
            }
            default:
                throw new DriverNotFindException(this.browserType);
        }
    }
}
