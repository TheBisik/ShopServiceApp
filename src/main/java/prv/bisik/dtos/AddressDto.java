package prv.bisik.dtos;

public class AddressDto {

    private long id;

    private String street;

    private String number;

    private String postalCode;

    private String city;

    private String state;

    private String country;

    public AddressDto(long id, String street, String number, String postalCode, String city, String state, String country) {
        this.id = id;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
        this.state = state;
        this.country = country;
    }

    public long getId() {
        return id;
    }

    public String getStreet() {
        return street;
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

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }
}
