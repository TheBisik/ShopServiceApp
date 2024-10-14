package prv.bisik.domain;

import jakarta.persistence.*;

import static prv.bisik.utils.DisplayUtil.displayInLine;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    private String street;

    @Column(nullable = false)
    private String number;

    @Column(nullable = false)
    private String postalCode;

    @Column(nullable = false)
    private String city;

    @Column(nullable = false)
    private String state;

    @Column(nullable = false)
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