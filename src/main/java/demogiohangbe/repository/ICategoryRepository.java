package demogiohangbe.repository;

import demogiohangbe.model.Category;
import org.springframework.data.repository.CrudRepository;

public interface ICategoryRepository extends CrudRepository<Category,Long> {
}
