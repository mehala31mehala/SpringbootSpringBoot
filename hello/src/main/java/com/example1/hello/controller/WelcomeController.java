package com.example1.hello.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @RequestMapping("/post")
    public String welcome(){

        return "Welcome to String Boot";
    }
}
