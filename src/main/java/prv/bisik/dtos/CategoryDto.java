package prv.bisik.dtos;

public class CategoryDto {

    private long id;

    private String name;

    private String address;

    private String number;

    private String email;

    private String password;

    public CategoryDto(long id, String name, String address, String number, String email, String password) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.number = number;
        this.email = email;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
