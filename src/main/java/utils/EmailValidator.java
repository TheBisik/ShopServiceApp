package utils;

import java.util.regex.Pattern;

public class EmailValidator {
    private final static String emailRegex = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b";
    private final static Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);

    public static boolean isValidEmail(String email) {
        return pattern.matcher(email).matches();
    }
}
