package constant;

public class ErrorMessageConstants {
    //Errors for Login
    public final static String ERR_WRONG_CRED = "Invalid grant: user credentials are invalid";
    public final static String ERR_WRONG_CRED_N = "invalid_grant";
    public final static String ERR_MISSING_USER = "Missing parameter: `username`";
    public final static String ERR_MISSING_USER_N = "invalid_request";
    public final static String ERR_MISSING_PASS = "Missing parameter: `password`";

    //Errors for CreateUpType
    public final static String ERR_MISSING_NAME = "MISSING_NAME";
    public final static String ERR_MISSING_RESET_UNIT = "UNKNOWN_RESET_UNIT";
    public final static String ERR_MISSING_RESET_UNIT_2 = "\"resetUnit\" is not allowed to be empty";

}
