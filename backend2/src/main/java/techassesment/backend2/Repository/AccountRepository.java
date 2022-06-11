package techassesment.backend2.Repository;

import org.springframework.data.repository.CrudRepository;
import techassesment.backend2.Model.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
