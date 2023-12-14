import org.testng.annotations.Test;

import static common.constant.AlertConstants.LOGIN_ALERT;
import static common.constant.LoginConstants.EMAIL_ADDRESS;
import static common.constant.LoginConstants.PASSWORD;
import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {
    @Test(description = "Verify that a user can login to the application with valid credentials")
    public void testValidLogin() {
        screen().getNavigationBarScreen()
                .tapOnLoginIcon();
        screen().getLoginScreen()
                .login(EMAIL_ADDRESS, PASSWORD);
        assertEquals(
                uiComponent().getAlertScreen().getAlertTitle(),
                LOGIN_ALERT.getAlertTitle()
        );
        assertEquals(
                uiComponent().getAlertScreen().getAlertMessage(),
                LOGIN_ALERT.getAlertMessage()
        );
    }
}
