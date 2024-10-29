package comp31.lab4.controllers;

import org.slf4j.Logger;                // import logger from slf4j
import org.slf4j.LoggerFactory;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import comp31.lab4.models.User;

import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    
    Logger logger = LoggerFactory.getLogger(MainController.class);

    public MainController() {
        super();
    }

    @GetMapping("/")
    public String getRoot(Model model) {
        logger.info("<<<<<<<<< at get root >>>>>>>>>");
        model.addAttribute("user", new User());
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(User user) {
        logger.info("<<<<<<<<<<< at /login >>>>>>>>>>>");
        String next = "redirect:/main?user=" + user.getUserId();
        return next;
    }

    @GetMapping("/main")
    public String getMain() {
        logger.info("<<<<<<<<<<at /main get method >>>>>>>>>>");
        return "main";
    }

}