package components.popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class EducationPopup extends AbsBasePopup{

    private String basePopupSelector = ".header3__nav-item-popup-wrapper.js-header3-popup[data-name=\"learning\"]";

    public EducationPopup(WebDriver driver) {
        super(driver);
    }

    @Override
    public void popupShouldNotBeVisible() {
        webDriverWait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(basePopupSelector)));
    }

    @Override
    public void popupShouldBeVisible() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(basePopupSelector)));
    }
}
