package prv.bisik.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
public class Customer extends User {

    @Nonnull
    private String name;
    @Nonnull
    private String surname;
    @Nonnull
    private String phoneNumber;
    @Nonnull
    private Date date; //Nie ustawiam na final ponieważ ktoś może się pomylić lub chcieć zmienić date w razie podania fałszywych informacji

    public Customer(long id, String password, String email, String name, String surname, String phoneNumber, Date date) {
        super(id, password, email);
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.date = date;
    }

    public Customer() {
        super();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}







