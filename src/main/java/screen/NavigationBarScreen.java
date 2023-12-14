package screen;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.WebDriver;

public class NavigationBarScreen extends BaseScreen {
    public NavigationBarScreen(WebDriver driver) {
        super(driver);
    }

    public void tapOnLoginIcon() {
        tap(MobileBy.AccessibilityId("Login"));
    }
}
