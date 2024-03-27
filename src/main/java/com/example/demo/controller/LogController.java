package com.example.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.LogService;
import com.example.demo.domain.login;

@Controller
public class LogController {
 
    @Autowired
    private LogService service;
 
    @GetMapping("/")
    public String api()
    {
 
        return "home";
    }
@GetMapping("/login")
    public String login()
    {
 
            return "index";
    }
    @GetMapping("/home")
    public String home()
    {
 
            return "home";
    }
 
 
    @PostMapping("/log")
    public String login(@ModelAttribute("user") login user) {
 
        login oauthUser = service.log(user.getEmail(), user.getPassword());
 
        System.out.print(oauthUser);
        if (Objects.nonNull(oauthUser)) {
            return "redirect:/home";
        } else {
            return "redirect:/";
        }
    }
 
    @GetMapping("/register")
    public String register()
    {
 
        return "register";
    }
    @GetMapping("/bill")
    public String bill()
    {
 
        return "bill";
    }
    @GetMapping("/product")
    public String product()
    {
 
        return "product";
    }
    @GetMapping("/disp")
    public String display() {
        return "display";
    }
}
