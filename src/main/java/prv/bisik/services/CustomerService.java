package prv.bisik.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prv.bisik.domain.Customer;
import prv.bisik.repositories.CustomerRepository;
import prv.bisik.repositories.ProductRepository;
import prv.bisik.dtos.CustomerDto;

@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public CustomerDto getCustomerById(Long id) {
        customerRepository.getCustomerById(id);
        return new Customer();
    }

    public CustomerDto addCustomer(Customer customer) {
        if (customerRepository.existsByEmail(customer.getEmail())) {
            throw new IllegalArgumentException("Customer with this email already exists");
        }
        return customerRepository.save(customer);
    }


}
