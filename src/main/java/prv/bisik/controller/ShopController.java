package prv.bisik.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import prv.bisik.dtos.AddressDto;
import prv.bisik.dtos.CategoryDto;
import prv.bisik.dtos.CustomerDto;
import prv.bisik.dtos.ProductDto;
import prv.bisik.services.CustomerService;

import java.util.List;

@RestController
@RequestMapping("/shop")
public class ShopController {

    @Autowired
    CustomerService customerService;

    @GetMapping("/customer/{id}")
    ResponseEntity<CustomerDto> getCustomerById(@PathVariable Long id) {
        CustomerDto returnedCustomer = customerService.getCustomerById(id);
        return new ResponseEntity<>(returnedCustomer, HttpStatus.OK);
    }

    @GetMapping("/product")
    ResponseEntity<ProductDto> getProductByName(@RequestParam String name) {
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @GetMapping("/product")
    ResponseEntity<List<ProductDto>> getProductsByCategory(@RequestBody CategoryDto categoryDto) {
        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }

    @PostMapping("/customer")
    ResponseEntity addCustomer(@RequestBody CustomerDto customerDto) {
        try {
            CustomerDto createdCustomer = customerService.addCustomer(customerDto);
            return new ResponseEntity<>(createdCustomer, HttpStatus.CREATED);
        } catch (IllegalArgumentException e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    // Add new endpoint for getting all Address
    @GetMapping("/address")
    ResponseEntity<List<AddressDto>> getAllAddress() {
        return new ResponseEntity<>(null, HttpStatus.OK);
    }

}
// fix