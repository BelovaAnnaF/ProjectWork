package driver;
import exeption.DriverNotFindException;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.config.Config;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.openqa.selenium.WebDriver;


public interface IDriver {

    WebDriver newDriver() throws DriverNotFindException;

    default void downloadLocalWebDriver(DriverManagerType driverType) throws DriverNotFindException {
        Config wdmConfig = WebDriverManager.globalConfig();
        wdmConfig.setAvoidBrowserDetection(true);

        String browserVersion = System.getProperty("browser.version", "");

        if (!browserVersion.isEmpty()) {
            switch (driverType) {
                case CHROME:
                    wdmConfig.setChromeDriverVersion(browserVersion);
                    break;
                default:
                    throw new DriverNotFindException(driverType.name());
            }
        }

        WebDriverManager.getInstance(driverType).setup();
    }
}