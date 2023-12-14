package common.constant;


public enum AlertConstants {
    LOGIN_ALERT("Success", "You are logged in!"),
    SIGNUP_ALERT("Signed Up!", "You successfully signed up!");

    private final String alertTitle, alertMessage;

    AlertConstants(String alertTitle, String alertMessage) {
        this.alertTitle = alertTitle;
        this.alertMessage = alertMessage;
    }

    public String getAlertTitle() {
        return alertTitle;
    }

    public String getAlertMessage() {
        return alertMessage;
    }
}
