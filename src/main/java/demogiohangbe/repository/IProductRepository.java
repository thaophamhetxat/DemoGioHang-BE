package demogiohangbe.repository;

import demogiohangbe.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface IProductRepository extends CrudRepository<Product,Long> {
}
