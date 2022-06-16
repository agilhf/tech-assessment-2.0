package techassesment.backend2.Model;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Transaction")
@javax.persistence.Table(name = "\"Transaction\"")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @Column(name = "\"amount\"")
    private double amount;
    @Column(name = "\"bookingDate\"")
    private Date bookingDate;
    @Column(name = "\"cdtDbtInd\"")
    private String cdtDbtInd;
    @Column(name = "\"counterparty\"")
    private double counterparty;
    @Column(name = "\"remittanceInf\"")
    private String remittanceInf;

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setBookingDate(Date bookingDate) {
        this.bookingDate = bookingDate;
    }

    public void setCdtDbtInd(String cdtDbtInd) {
        this.cdtDbtInd = cdtDbtInd;
    }

    public void setCounterparty(double counterparty) {
        this.counterparty = counterparty;
    }

    public void setRemittanceInf(String remittanceInf) {
        this.remittanceInf = remittanceInf;
    }

    public long getId() {
        return id;
    }

    public double getAmount() {
        return amount;
    }

    public Date getBookingDate() {
        return bookingDate;
    }

    public String getCdtDbtInd() {
        return cdtDbtInd;
    }

    public double getCounterparty() {
        return counterparty;
    }

    public String getRemittanceInf() {
        return remittanceInf;
    }

    public Transaction(){}

    public Transaction(double amount, Date bookingDate, String cdtDbtInd, double counterparty, String remittanceInf) {
        this.amount = amount;
        this.bookingDate = bookingDate;
        this.cdtDbtInd = cdtDbtInd;
        this.counterparty = counterparty;
        this.remittanceInf = remittanceInf;
    }
}
