package common.constant;

import static util.Reader.getEnvironmentConfig;

public class LoginConstants {
    public static final String EMAIL_ADDRESS = getEnvironmentConfig("email_address");
    public static final String PASSWORD = getEnvironmentConfig("password");
}
