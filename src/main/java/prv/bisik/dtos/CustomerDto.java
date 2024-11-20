package prv.bisik.dtos;

public class CustomerDto {

    private long id;

    private String password;

    private String email;

    private String customerName;

    private AddressDto addressDto;

    private String phoneNumber;

    public CustomerDto(long id, String password, String email, String customerName, AddressDto addressDto, String phoneNumber) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.customerName = customerName;
        this.addressDto = addressDto;
        this.phoneNumber = phoneNumber;
    }

    public long getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public AddressDto getAddressDto() {
        return addressDto;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
// fix