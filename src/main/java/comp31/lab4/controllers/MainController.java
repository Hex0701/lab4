package comp31.lab4.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import comp31.lab4.models.User;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    Logger logger = LoggerFactory.getLogger(MainController.class);

    public MainController() {
        super();
    }

    @GetMapping("/")
    public String getRoot(Model model) {
        model.addAttribute("user", new User());
        logger.info(">>>> getRoot.  Navigating to 'login' page.");
        return "login";
    }

    @PostMapping("/login")
    public String postLogin(User user) {
        logger.info(">>>>> postLogin: user=" + user);
        String next = "redirect:/main?userId=" + user.getUserId();
        logger.debug(">>>> Next: " + next);
        return next;
    }

    @GetMapping("/main")
    public String getMain(@RequestParam String userId, Model model) {
        model.addAttribute("userId", userId);
        logger.debug(">>>> ");
        return "main";
    }

}
