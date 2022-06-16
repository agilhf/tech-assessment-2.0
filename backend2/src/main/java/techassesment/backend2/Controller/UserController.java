package techassesment.backend2.Controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import techassesment.backend2.Model.Account;
import techassesment.backend2.Model.User;
import techassesment.backend2.Repository.UserRepository;

import java.security.Principal;
import java.util.List;
import java.util.Set;

@RestController
@CrossOrigin(origins = "http://localhost:8080")
public class UserController {

    private final UserRepository userRepository;


    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

//    @RequestMapping("/user")
//    public Principal user(Principal user){
//        return user;
//    }

    /*@RequestMapping("/login")
    public boolean login(@RequestParam String userName, String password) {
        User user1 = (User) userRepository.findByUserName(userName);
        if(user1 != null && user1.getPassword() == password) {
            return true;
        } else {return false;}
    }*/

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/users")
    public List<User> getUsers() {
        return (List<User>) userRepository.findAll();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PostMapping("/users")
    void addUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/users/{userName}")
    public long getUserId(@PathVariable String userName){
        User user = (User) userRepository.findByUserName(userName);
        return user.getId();
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @GetMapping("/users/accounts/{id}")
    public Set<Account> getAccountsFromUser(@PathVariable long id){
        return  userRepository.findById(id).getAccounts();
    }

}
