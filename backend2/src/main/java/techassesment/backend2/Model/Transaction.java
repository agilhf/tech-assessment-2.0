package techassesment.backend2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Transaction {
    @Id
    private long id;
    private long amount;
    private Date bookingDate;
    private String cdtDbtInd;
    private long counterparty;
    private String remittanceInf;

    public Transaction(){}

    public Transaction(long amount, Date bookingDate, String cdtDbtInd, long counterparty, String remittanceInf) {
        this.amount = amount;
        this.bookingDate = bookingDate;
        this.cdtDbtInd = cdtDbtInd;
        this.counterparty = counterparty;
        this.remittanceInf = remittanceInf;
    }
}
