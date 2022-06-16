package techassesment.backend2.Repository;

import org.springframework.data.repository.CrudRepository;
import techassesment.backend2.Model.Account;
import techassesment.backend2.Model.Transaction;
import techassesment.backend2.Model.User;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Long> {

}
