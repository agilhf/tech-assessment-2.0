package techassesment.backend2.Model;

import javax.persistence.*;
import java.util.Set;

@Entity(name = "Account")
@javax.persistence.Table(name = "\"Account\"")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "\"other\"")
    private String other;
    @Column(name = "\"type\"")
    private String type;
    @Column(name = "\"name\"")
    private String name;
    @Column(name = "\"currency\"")
    private String currency;
    @Column(name = "\"balance\"")
    private double balance;
    @Column(name = "\"status\"")
    private String status;
    @Column(name = "\"accountSubType\"")
    private String accountSubType;
    @Column(name = "\"transactions\"")
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Set<Transaction> transactions;

    public long getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }


    public String getOther() {
        return other;
    }


    public String getName() {
        return name;
    }

    public String getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    public String getStatus() {
        return status;
    }

    public String getAccountSubType() {
        return accountSubType;
    }

    public Set<Transaction> getTransactions() {
        return transactions;
    }



    public void setOther(String other) {
        this.other = other;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setAccountSubType(String accountSubType) {
        this.accountSubType = accountSubType;
    }

    public void setTransactions(Set<Transaction> transactions) {
        this.transactions = transactions;
    }



    public Account(){
    }

    public Account(String other, String name, String currency, long balance, String status, String accountSubType, Set<Transaction> transactions ) {
        this.other = other;
        this.name = name;
        this.currency = currency;
        this.balance = balance;
        this.status = status;
        this.accountSubType = accountSubType;
        this.transactions = transactions;
    }
}
