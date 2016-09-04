package kg.dev.services;

import kg.dev.models.User;

import java.util.List;

/**
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 */
public interface UserService {
    
    List<User> getAll();
    
}
