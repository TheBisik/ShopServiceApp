package prv.bisik.domain;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import static prv.bisik.utils.DisplayUtil.displayInLine;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Nonnull
    private String street;

    @Nonnull
    private String number;

    @Nonnull
    private String postalCode;

    @Nonnull
    private String city;

    @Nonnull
    private String state;

    @Nonnull
    private String country;

    public Address(String street, String number, String postalCode, String city, String state, String country) {

        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public Address() {

    }

    public void getAddress() {
            displayInLine("\nLokalizacja: " + this.street + " " + number + ", " + city + ", " + postalCode + ", " + state + ", " + country);
        }

}