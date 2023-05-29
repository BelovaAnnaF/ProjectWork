package components.popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import pageobject.AbsPageObject;

public abstract class AbsBasePopup extends AbsPageObject implements IPopup {
    public AbsBasePopup(WebDriver driver) {
        super(driver);
    }


}
