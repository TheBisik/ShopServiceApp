package domain;

import java.util.Date;

public class Customer extends User {

    protected String name;
    protected String surname;
    protected String phoneNumber;
    protected Date date; //Nie ustawiam na final ponieważ ktoś może się pomylić lub chcieć zmienić date w razie podania fałszywych informacji

    public Customer(long id, String password, String email, String name, String surname, String phoneNumber, Date date) {
        super(id, password, email);
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.date = date;
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







