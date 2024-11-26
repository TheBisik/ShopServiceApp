package prv.bisik.services;

import org.springframework.stereotype.Service;
import prv.bisik.domain.Customer;
import prv.bisik.mappers.CustomerMapper;
import prv.bisik.repositories.CustomerRepository;
import prv.bisik.dtos.CustomerDto;

import java.util.Optional;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDto getCustomerById(Long id) {
        return CustomerMapper.toDto(customerRepository.getCustomerById(id));
    }

    public CustomerDto addCustomer(CustomerDto customerDto) {
        Optional<Customer> opt = Optional.ofNullable(customerRepository.getCustomerByEmail(customerDto.getEmail()));
        if (opt.isPresent()) {
            throw new IllegalArgumentException("Customer with this email already exists");
        }
        return CustomerMapper.toDto(customerRepository.save(CustomerMapper.toEntity(customerDto)));
    }

}