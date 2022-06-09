package techassesment.backend2.Model;

import javax.persistence.*;
import java.util.List;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id; //CostumerID & userID
    private String type;
    private String userName;
    private String firstName;
    private String lastName;
    private String customerNumber;
    private String cardNumber;
    private String password;
    private String pin;
    @ManyToOne
    private Account accounts;

    public User() {}

    public User(String type, String userName, String firstName,
                String lastName, String customerNumber, String cardNumber,
                String password, String pin, Account accounts){
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

    public void setId(Long id){
        this.id= id;
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

    public Account getAccounts(){

        return accounts;
    }
    public void setBankAccounts(Account accounts) {
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
