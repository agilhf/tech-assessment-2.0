package techassesment.backend2.Repository;

import org.springframework.data.repository.CrudRepository;
import techassesment.backend2.Model.User;

public interface UserRepository extends CrudRepository<User, Long> {
}
