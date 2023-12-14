package common;

import org.openqa.selenium.WebDriver;
import screen.BaseScreen;
import screen.LoginScreen;
import screen.NavigationBarScreen;

public class ScreenProvider extends BaseScreen {
    public ScreenProvider(WebDriver driver) {
        super(driver);
    }

    public NavigationBarScreen getNavigationBarScreen() {
        return new NavigationBarScreen(driver);
    }

    public LoginScreen getLoginScreen() {
        return new LoginScreen(driver);
    }
}
