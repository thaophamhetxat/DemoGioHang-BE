package demogiohangbe.repository;

import demogiohangbe.model.BillProduct;
import org.springframework.data.repository.CrudRepository;

public interface IBillProductRepository extends CrudRepository<BillProduct,Long> {
    BillProduct findById(long id);

}
