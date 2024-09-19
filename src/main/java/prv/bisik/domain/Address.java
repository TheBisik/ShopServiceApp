package prv.bisik.domain;

import static prv.bisik.utils.DisplayUtil.displayInLine;


public class Address {
    final private String street, number, postalCode, city, state, country;

    public Address(String street, String number, String postalCode, String city, String state, String country) {
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

        public void getAddress() {
            displayInLine("\nLokalizacja: " + this.street + " " + number + ", " + city + ", " + postalCode + ", " + state + ", " + country);
        }

}