package prv.bisik.mappers;

import prv.bisik.domain.Customer;
import prv.bisik.dtos.CustomerDto;

public class CustomerMapper {


    public static CustomerDto toDto(Customer customer) {
        return new CustomerDto(
                customer.getId(),
                customer.getPassword(),
                customer.getEmail(),
                customer.getCustomerName(),
                AddressMapper.toDto(customer.getAddress()),
                customer.getPhoneNumber()
        );
    }

    public static Customer toEntity(CustomerDto customerDto) {
        return new Customer(
                customerDto.getId(),
                customerDto.getPassword(),
                customerDto.getEmail(),
                customerDto.getCustomerName(),
                AddressMapper.toEntity(customerDto.getAddressDto()),
                customerDto.getPhoneNumber()
        );
    }
}
