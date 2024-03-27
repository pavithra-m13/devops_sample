package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.login;
import com.example.demo.repository.LogRepo;

@Service
public class LogService {
            @Autowired
            private LogRepo rep;
            public login log(String email, String password){
                login user = rep.findByEmailAndPassword(email, password);
                return user;
 
            }

}
