package prv.bisik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prv.bisik.domain.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

    Customer getCustomerByEmail(String email);

    Customer getCustomerById(Long id);

    Customer save(Customer customer);

    void delete(Customer entity);
}
// fix