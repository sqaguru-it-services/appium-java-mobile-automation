package common;

import org.openqa.selenium.WebDriver;
import screen.BaseScreen;
import screen.uicomponent.AlertScreen;

public class UiComponentProvider extends BaseScreen {
    public UiComponentProvider(WebDriver driver) {
        super(driver);
    }

    public AlertScreen getAlertScreen() {
        return new AlertScreen(driver);
    }
}
