package demogiohangbe.repository;

import demogiohangbe.model.Users;
import org.springframework.data.repository.CrudRepository;

public interface IUsersRepository extends CrudRepository<Users,Long> {
}
