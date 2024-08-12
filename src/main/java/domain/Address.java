package domain;

public class  Address {
    String Street, number, postalCode, city;

    public Address(String street, String number, String postalCode, String city) {
        this.Street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getStreet() {
        return Street;
    }

    public String getNumber() {
        return number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }

}
