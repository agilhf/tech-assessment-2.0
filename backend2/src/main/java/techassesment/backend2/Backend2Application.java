package techassesment.backend2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import techassesment.backend2.Model.Account;
import techassesment.backend2.Model.Transaction;
import techassesment.backend2.Model.User;
import techassesment.backend2.Repository.AccountRepository;
import techassesment.backend2.Repository.TransactionRepository;
import techassesment.backend2.Repository.UserRepository;

import java.time.Instant;
import java.time.LocalDate;
import java.util.*;

@SpringBootApplication
public class Backend2Application {


    public static void main(String[] args) {
        SpringApplication.run(Backend2Application.class, args);
    }

    @Bean
    public CommandLineRunner demo(AccountRepository accountRepository, UserRepository userRepository, TransactionRepository transactionRepository) {
        return (args) -> {
            User user1 = new User();
            user1.setUserName("johndoe");
            user1.setPassword("test");
            user1.setFirstName("John");
            user1.setLastName("Doe");
            user1.setCardNumber("19282828929120");
            user1.setCustomerNumber("NKD282838734");

            // save a few customers
            Account account1 = new Account();
            account1.setOther("775a26eb-e564-4944-b2e9-a263f50dc419");
            account1.setName("RBS");
            account1.setBalance( 222.333);
            account1.setCurrency("CHF");
            account1.setType("Personal");
            Account account2 = new Account();
            account2.setOther("775a26eb-e564-4944-b2e9-a2lk63f50dc419");
            account2.setName("RBS");
            account2.setBalance(-102.443);
            account2.setCurrency("CHF");
            account2.setType("Personal");
            Account account3 = new Account();
            account3.setOther("775a26eb-e564-4944-b2e9-akk3f50dc419");
            account3.setName("CS");
            account3.setBalance(2314.41);
            account3.setCurrency("CHF");
            account3.setType("Personal");
            Account account4 = new Account();
            account4.setOther("775a26eb-e564-4944-b2e9-a26kl3f50dc419");
            account4.setName("RBS");
            account4.setBalance(4000.255);
            account4.setCurrency("CHF");
            account4.setType("Personal");
            Set<Account> accountSet = new HashSet<Account>();
            accountSet.add(account1);
            accountSet.add(account2);
            accountSet.add(account3);
            accountSet.add(account4);
            user1.setBankAccounts(accountSet);
            Transaction transaction1 = new Transaction();
            transaction1.setAmount(123.22);
            transaction1.setBookingDate(Date.from(Instant.ofEpochSecond(485232466)));
            transaction1.setCounterparty(1414);
            transaction1.setRemittanceInf("Adobe");
            Transaction transaction2 = new Transaction();
            transaction2.setAmount(-476.22);
            transaction2.setBookingDate(Date.from(Instant.now()));
            transaction2.setCounterparty(3334344);
            transaction2.setRemittanceInf("Amazon");
            Transaction transaction3 = new Transaction();
            transaction3.setAmount(15556.96);
            transaction3.setBookingDate(Date.from(Instant.ofEpochSecond(43466)));
            transaction3.setCounterparty(342);
            transaction3.setRemittanceInf("Nike");
            Transaction transaction4= new Transaction();
            transaction4.setAmount(-17237);
            transaction4.setBookingDate(Date.from(Instant.now()));
            transaction4.setCounterparty(3432);
            transaction4.setRemittanceInf("Google");
            Transaction transaction5 = new Transaction();
            transaction5.setAmount(189.2334);
            transaction5.setBookingDate(Date.from(Instant.ofEpochSecond(423466)));
            transaction5.setCounterparty(334342);
            transaction5.setRemittanceInf("Nestle");

            Transaction transaction6 = new Transaction();
            transaction6.setAmount(1277.22);
            transaction6.setBookingDate(Date.from(Instant.now()));
            transaction6.setCounterparty(84584);
            transaction6.setRemittanceInf("Playstation");
            Transaction transaction7 = new Transaction();
            transaction7.setAmount(2112);
            transaction7.setBookingDate(Date.from(Instant.ofEpochSecond(42466)));
            transaction7.setCounterparty(7968769);
            transaction7.setRemittanceInf("Arbeitlohn");
            Transaction transaction8 = new Transaction();
            transaction8.setAmount(-1892);
            transaction8.setBookingDate(Date.from(Instant.ofEpochSecond(22466)));
            transaction8.setCounterparty(58498);
            transaction8.setRemittanceInf("Mountaindew");
            Transaction transaction9 = new Transaction();
            transaction9.setAmount(-21.029);
            transaction9.setBookingDate(Date.from(Instant.now()));
            transaction9.setCounterparty(156);
            transaction9.setRemittanceInf("Ikea");

            Set<Transaction> transactionsSet1 = new HashSet<Transaction>();
            transactionsSet1.add(transaction1);
            transactionsSet1.add(transaction2);
            transactionsSet1.add(transaction3);
            Set<Transaction> transactionsSet2 = new HashSet<Transaction>();
            transactionsSet2.add(transaction4);
            transactionsSet2.add(transaction5);
            transactionsSet2.add(transaction6);
            Set<Transaction> transactionsSet3= new HashSet<Transaction>();
            transactionsSet3.add(transaction7);
            transactionsSet3.add(transaction8);
            transactionsSet3.add(transaction9);
            account1.setTransactions(transactionsSet1);
            account2.setTransactions(transactionsSet2);
            account3.setTransactions(transactionsSet3);

            userRepository.save(user1);
            accountRepository.save(account1);
            accountRepository.save(account2);
            accountRepository.save(account3);
            accountRepository.save(account4);
            transactionRepository.save(transaction1);
            transactionRepository.save(transaction2);
            transactionRepository.save(transaction3);
            transactionRepository.save(transaction4);
            transactionRepository.save(transaction5);
            transactionRepository.save(transaction6);
            transactionRepository.save(transaction7);
            transactionRepository.save(transaction8);
            transactionRepository.save(transaction9);


        };
    }
}
