package main.java.domain;

import java.util.regex.Pattern;

public abstract class User {
    protected final long id;
    protected String password;
    protected String email;
    private final static String emailRegex = "\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,}\\b";
    private final static Pattern pattern = Pattern.compile(emailRegex, Pattern.CASE_INSENSITIVE);

    public User(long id, String password, String email) {
        this.id = id;
        this.password = password;
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email address");
        }

    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email address");
        }
    }

    private static boolean isValidEmail(String email) {
        return pattern.matcher(email).matches();
    }
}

