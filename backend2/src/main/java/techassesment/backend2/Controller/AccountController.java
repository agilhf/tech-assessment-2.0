package techassesment.backend2.Controller;

import org.springframework.web.bind.annotation.*;
import techassesment.backend2.Model.Account;
import techassesment.backend2.Repository.AccountRepository;

import java.math.BigDecimal;
import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository){
        this.accountRepository = accountRepository;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/accounts")
    public List<Account> getAccount() {
        return (List<Account>) accountRepository.findAll();
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/sumBalance")
    public Object getSumBalance() {
        List<Account> accountlist = (List<Account>) accountRepository.findAll();
        System.out.println(accountlist);
        double sum = 0;
        for (Account element : accountlist) {
            sum= sum + element.getBalance();

        }
        return sum;
    }
    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/accounts")
    void addAccount(@RequestBody Account account) {
        accountRepository.save(account);
    }

}
