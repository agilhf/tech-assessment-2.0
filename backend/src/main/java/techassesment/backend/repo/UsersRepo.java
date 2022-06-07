package techassesment.backend.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import techassesment.backend.model.User;

public interface UsersRepo extends JpaRepository<User, Long> {
}
