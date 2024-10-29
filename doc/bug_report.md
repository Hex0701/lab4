# Bug Report

1. Bug description
    * describe steps to reporoduce the problem
    * explain the cause of the problem
    * show code fragment contaiing the bug
    * show corrected code
        
2. Bug #1 the main page shows welcome Null insted of name 
    * Access login page >> Type in anything >> Click Login
    * Model and User parameters are not passed into the Main function.
    * ```@GetMapping("/main")
            public String getMain() {
                logger.info(">>>> We are at the main endpoint.");
                return "main";
                }```
    * ```@GetMapping("/main")
            public String getMain(Model model, User user){
                logger.info(">>>> We are at the main endpoint.");
                model.addAttribute("user", user.getUserId());
                return "main";
                }```

