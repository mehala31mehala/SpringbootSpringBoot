package com.User.example.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.User.example.application.entity.Login;
import com.User.example.application.service.LoginService;



@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/saveLogin")
    private String saveLogin(@RequestBody Login login){
        loginService.save(login);
        return "student save successfully";
    }
   

}