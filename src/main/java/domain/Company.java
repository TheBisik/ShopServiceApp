package domain;

public class Company {
    private String companyName;
    private Address address;
    public Company(String companyName, Address address) {
        this.companyName = companyName;
        this.address = address;
    }
}
