package driver;

import exeption.DriverNotFindException;
import io.github.bonigarcia.wdm.config.DriverManagerType;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;

public class ChromeWebDriver implements IDriver{
    @Override
    public WebDriver newDriver() throws DriverNotFindException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.setCapability(CapabilityType.VERSION, System.getProperty("browser.version", ""));
        options.setCapability("enableVNC", Boolean.parseBoolean(System.getProperty("enableVNC", "false")));

        Logger logger = LogManager.getLogger();
        downloadLocalWebDriver(DriverManagerType.CHROME);

        return new ChromeDriver(options);
    }
}
