package prv.bisik.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prv.bisik.repositories.ProductRepository;
import prv.bisik.dtos.CustomerDto;

@Service
public class CustomerService {

    private ProductRepository productRepository;

    @Autowired
    public CustomerService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public CustomerDto getCustomerById(Long id) {
        productRepository.getProductByName("TEst");
        return new CustomerDto();
    }


}
