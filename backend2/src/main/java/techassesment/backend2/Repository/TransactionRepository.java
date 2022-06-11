package techassesment.backend2.Repository;

import org.springframework.data.repository.CrudRepository;
import techassesment.backend2.Model.Transaction;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
}
