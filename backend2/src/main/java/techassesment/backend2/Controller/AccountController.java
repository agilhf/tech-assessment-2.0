package techassesment.backend2.Controller;

import org.springframework.web.bind.annotation.*;
import techassesment.backend2.Model.Account;
import techassesment.backend2.Repository.AccountRepository;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }

    @GetMapping("/accounts")
    public List<Account> getUsers() {
        return (List<Account>) accountRepository.findAll();
    }

    @PostMapping("/accounts")
    void addUser(@RequestBody Account account) {
        accountRepository.save(account);
    }
}
