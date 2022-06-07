package techassesment.backend.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Map;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Map<String,Long> bankAccounts;

    public User() {}

    public User(String name, Map<String,Long> bankAccounts){
        this.name = name;
        this.bankAccounts = bankAccounts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id){
        this.id= id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public Map<String,Long> getBankAccounts(){
        return bankAccounts;
    }
    public void setBankAccounts(Map<String,Long> bankAccounts) {
        this.bankAccounts = bankAccounts;
    }

    @Override
    public String toString() {
        return "User{" +
                "id="+ id +
                ", name=" + name + '\'' +
                ", bankAccounts=" + bankAccounts + '\'' +
                '}';
    }

}
