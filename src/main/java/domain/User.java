package domain;

import utils.EmailValidator;

public abstract class User {
    long id;
    String password;
    String email;

    public User(long id, String password, String email) {
        this.id = id;
        this.password = password;
        if (EmailValidator.isValidEmail(email)) {
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
        if (EmailValidator.isValidEmail(email)) {
            this.email = email;
        } else {
            throw new IllegalArgumentException("Invalid email address");
        }
    }
}

