package com.example.myproject.controller;

import com.example.myproject.domain.CustomUser;
import com.example.myproject.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class MainController {
    private final UserService userService;

    public MainController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public String index(){
        return "index.html";
    }

    @GetMapping("/log")
    public String log(){
        return "login.html";
    }

//    @PostMapping("/log")
//    public String logPost(){
//        return "0";
//    }

    @GetMapping("/reg")
    public String reg(){ return "registration.html";}

    @PostMapping("/reg")
    public void regPost(@RequestBody CustomUser customUser){
        System.out.println(customUser);
        userService.addUser(customUser);
    }
}
