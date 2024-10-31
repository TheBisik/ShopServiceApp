package prv.bisik.domain;


import jakarta.persistence.*;
import prv.bisik.Exceptions.MySpecException;
import prv.bisik.utils.EmailValidator;

@MappedSuperclass
public abstract class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;

    @Column(nullable = false, length = 8)
    protected String password;

    @Column(nullable = false, length = 150)
    protected String email;

    public User() {
    }

    public User(long id, String password, String email) {
        this.id = id;
        this.password = password;
       // if (EmailValidator.isValidEmail(email)) {
            this.email = email;
       /* } else {
            throw new IllegalArgumentException("Invalid email address");
        }*/
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

    public void setEmail(String email) throws MySpecException {
        if (EmailValidator.isValidEmail(email)) {
            this.email = email;
        } else {
            //throw new IllegalArgumentException("Invalid email address");
            throw new MySpecException("Test exception");
        }
    }
}

