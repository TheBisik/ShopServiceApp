package prv.bisik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prv.bisik.domain.Address;

import java.util.List;

@Repository
public interface AddressRepository extends JpaRepository<Address, Long> {

    Address getAddressById(Long id);

    List<Address> getAddressesByCity(String city);

    // Nie jestem pewien czy to ma sens bo w danym miejscu może być pare takich samych adresów ale z różnymi id
    List<Address> getAddressesByNumberAndAndCityAndAndPostalCode(String number, String city, String postalCode);

}
// fix