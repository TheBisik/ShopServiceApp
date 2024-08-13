package domain;

import interfaces.AddressGetter;


public class Address implements AddressGetter {
    String street, number, postalCode, city, state, country;

    public Address(String street, String number, String postalCode, String city, String state, String country) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

        @Override
        public String getAddress() {
            return "\nLokalizacja: " + this.street + " " + number + ", " + city + ", " + postalCode + ", " + state + ", " + country;
        }

}