package techassesment.backend2.Controller;

import org.springframework.web.bind.annotation.*;
import techassesment.backend2.Model.Account;
import techassesment.backend2.Model.Transaction;
import techassesment.backend2.Repository.TransactionRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class TransactionController {
    private final TransactionRepository transactionRepository;

    public TransactionController(TransactionRepository transactionRepository){
        this.transactionRepository = transactionRepository;
    }
    @GetMapping("/transaction")
    public List<Transaction> getUsers() {
        return (List<Transaction>) transactionRepository.findAll();
    }

    @PostMapping("/transaction")
    void addUser(@RequestBody Transaction transaction) {
        transactionRepository.save(transaction);
    }
}
