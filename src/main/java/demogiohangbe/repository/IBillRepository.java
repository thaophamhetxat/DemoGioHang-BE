package demogiohangbe.repository;

import demogiohangbe.model.Bill;
import org.springframework.data.repository.CrudRepository;

public interface IBillRepository extends CrudRepository<Bill,Long> {
}
