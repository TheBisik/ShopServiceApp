package prv.bisik.domain;

import jakarta.persistence.*;

import static prv.bisik.utils.DisplayUtil.displayInLine;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, length = 100)
    private String street;

    @Column(nullable = false, length = 100)
    private String number;

    @Column(nullable = false, length = 10)
    private String postalCode;

    @Column(nullable = false, length = 100)
    private String city;

    @Column(nullable = false, length = 100)
    private String state;

    @Column(nullable = false, length = 100)
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