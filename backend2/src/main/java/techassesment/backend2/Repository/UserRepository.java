package techassesment.backend2.Repository;

import org.springframework.data.repository.CrudRepository;
import techassesment.backend2.Model.User;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUserName(String userName);
    User findById(long id);
}
