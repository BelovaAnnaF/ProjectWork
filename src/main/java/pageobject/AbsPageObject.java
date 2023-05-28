package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class AbsPageObject {
    protected WebDriver driver;
    protected WebDriverWait webDriverWait;
    public AbsPageObject(WebDriver driver) {
        this.driver = driver;
        this.webDriverWait = new WebDriverWait(driver, 10);
    }
}
