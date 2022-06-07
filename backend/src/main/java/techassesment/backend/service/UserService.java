package techassesment.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techassesment.backend.model.User;
import techassesment.backend.repo.UsersRepo;

@Service
public class UserService {
    private final UsersRepo usersRepo;

    @Autowired
    public UserService(UsersRepo usersRepo) {
        this.usersRepo = usersRepo;
    }

    public User addUser(User user) {
        return usersRepo.save(user);
    }
}
