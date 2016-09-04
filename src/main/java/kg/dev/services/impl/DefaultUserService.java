package kg.dev.services.impl;

import kg.dev.models.User;
import kg.dev.repositories.UserRepository;
import kg.dev.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 */
@Service
public class DefaultUserService implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }
}
