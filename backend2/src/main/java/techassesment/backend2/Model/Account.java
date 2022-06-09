package techassesment.backend2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Account {
    @Id
    private String other;
    private String otherScheme;
    private String countryCode;
    private String name;
    private String currency;
    private long balance;
    private String status;
    private String accountSubType;
    @ManyToOne
    private Transaction transactions;

    public Account(){}

    public Account(String other, String otherScheme, String countryCode, String name, String currency, long balance, String status, String accountSubType, Transaction transactions) {
        this.other = other;
        this.otherScheme = otherScheme;
        this.countryCode = countryCode;
        this.name = name;
        this.currency = currency;
        this.balance = balance;
        this.status = status;
        this.accountSubType = accountSubType;
        this.transactions = transactions;
    }
}
