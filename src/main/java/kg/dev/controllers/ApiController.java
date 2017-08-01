package kg.dev.controllers;

import kg.dev.models.User;
import kg.dev.models.UserDto;
import kg.dev.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

/**
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 */
@RestController
@RequestMapping("/api")
public class ApiController {

    private final UserService userService;

    @Autowired
    public ApiController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users", produces = "application/json")
    public List<User> getUsers() {
        return userService.getAll();
    }

    @RequestMapping(value = "/users", method = RequestMethod.POST)
    public UserDto addUser(@RequestBody @Valid UserDto userDto) {
        return userDto;
    }

}
