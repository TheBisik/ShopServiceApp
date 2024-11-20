package prv.bisik.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prv.bisik.domain.Category;
import prv.bisik.domain.Product;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Product getProductByName(String name);

    List<Product> getProductsByCategory(Category category);
}
// fix