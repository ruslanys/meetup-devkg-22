package kg.dev.controllers;

import kg.dev.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ruslan Molchanov (ruslanys@gmail.com)
 */
@Controller
public class MainController {

    @Autowired private UserService userService;

    @RequestMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/list")
    public String usersList(Model model) {
        model.addAttribute("users", userService.getAll());
        return "list";
    }

}
