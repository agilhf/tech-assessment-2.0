package techassesment.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techassesment.backend.model.User;
import techassesment.backend.repo.UsersRepo;

import java.util.UUID;

@Service
public class UserService {
    private final UsersRepo usersRepo;

    @Autowired
    public UserService(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public User addUser(User user) {
        user.setCardNumber(UUID.randomUUID().toString());
        user.setCustomerNumber(UUID.randomUUID().toString());
        return usersRepo.save(user);
    }
}
