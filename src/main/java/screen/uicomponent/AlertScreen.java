package screen.uicomponent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import screen.BaseScreen;

public class AlertScreen extends BaseScreen {
    private final String alertText;

    public AlertScreen(WebDriver driver) {
        super(driver);
        wait.until(ExpectedConditions.alertIsPresent());
        alertText = driver.switchTo().alert().getText();
    }

    public String getAlertTitle() {
        return alertText.split("\n")[0];
    }

    public String getAlertMessage() {
        return alertText.split("\n")[1];
    }
}
