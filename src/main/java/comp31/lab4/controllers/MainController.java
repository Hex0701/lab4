package comp31.lab4.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import comp31.lab4.models.User;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    public MainController() {
        super();
    }

    @GetMapping("/")
    public String getRoot(Model model) {
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(User user) {
        String next = "redirect:/main?user=" + user.getUserId();
        return next;
    }

    @GetMapping("/main")
    public String getMain() {
        return "main";
    }

}