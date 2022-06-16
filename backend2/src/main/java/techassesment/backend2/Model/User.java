package techassesment.backend2.Model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity(name = "User")
@javax.persistence.Table(name = "\"User\"")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id; //CostumerID & userID
    @Column(name = "\"type\"")
    private String type;
    @Column(name = "\"userName\"")
    private String userName;
    @Column(name = "\"firstName\"")
    private String firstName;
    @Column(name = "\"lastName\"")
    private String lastName;
    @Column(name = "\"customerNumber\"")
    private String customerNumber;
    @Column(name = "\"cardNumber\"")
    private String cardNumber;
    @Column(name = "\"password\"")
    private String password;
    @Column(name = "\"pin\"")
    private String pin;
    @Column(name = "\"accounts\"")
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<Account> accounts;

    public User() {}

    public User(String type, String userName, String firstName,
                String lastName, String customerNumber, String cardNumber,
                String password, String pin, Set<Account> accounts){
        this.type = type;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerNumber = customerNumber;
        this.cardNumber = cardNumber;
        this.password = password;
        this.pin = pin;
        this.accounts = accounts;
    }

    public Long getId() {
        return id;
    }


    public String getType() {
        return type;
    }
    public void setType(String type){
        this.type = type;
    }

    public String getUserName() {

        return userName;
    }
    public void setUserName(String userName){

        this.userName = userName;
    }

    public String getFirstName() {

        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName() {

        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getCustomerNumber() {

        return customerNumber;
    }
    public void setCustomerNumber(String customerNumber){

        this.customerNumber = customerNumber;
    }

    public String getCardNumber() {

        return cardNumber;
    }
    public void setCardNumber(String cardNumber){

        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password){

        this.password = password;
    }

    public String getPin() {
        return pin;
    }
    public void setPin(String pin){

        this.pin = pin;
    }

    public Set<Account> getAccounts(){

        return accounts;
    }
    public void setBankAccounts(Set<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id="+ id +
                ", type=" + type + '\'' +
                ", userName=" + userName + '\'' +
                ", firstName=" + firstName + '\'' +
                ", lastName=" + lastName + '\'' +
                ", customerNumber=" + customerNumber + '\'' +
                ", cardNumber=" + cardNumber + '\'' +
                ", password=" + password + '\'' +
                ", pin=" + pin + '\'' +
                ", accounts=" + accounts + '\'' +
                '}';
    }
}
