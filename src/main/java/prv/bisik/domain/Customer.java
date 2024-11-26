package prv.bisik.domain;

import jakarta.persistence.*;

@Entity
public class Customer extends User {

    @Column(nullable = false, length = 100)
    private String customerName;

    @OneToOne
    @JoinColumn(name = "address_id", referencedColumnName = "id")
    private Address address;

    @Column(nullable = false, length = 20)
    private String phoneNumber;

    public Customer() {
        super();
    }

    public Customer(String customerName, Address address, String phoneNumber) {
        this.customerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Customer(long id, String password, String email, String customerName, Address address, String phoneNumber) {
        super(id, password, email);
        this.customerName = customerName;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }
}







