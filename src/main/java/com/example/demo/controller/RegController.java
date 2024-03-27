package com.example.demo.controller;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.service.RegService;
import com.example.demo.domain.login;

@Controller
public class RegController {
 
    @Autowired
    private RegService service;
 
    
 
    @PostMapping("/reg")
    public String login(@ModelAttribute("user") login user) {
 
        service.saveUser(user.getUsername(),user.getEmail(),user.getPassword(),user.getDateofbirth(),user.getCompanyname(),user.getLocation());
 
        
            return "redirect:/home";
        
    }
 
   
 
}
