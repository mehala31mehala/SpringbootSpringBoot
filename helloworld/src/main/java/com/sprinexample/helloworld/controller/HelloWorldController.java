package com.sprinexample.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping("/hello")
    public  String helloworld(){
        return " Hello World,Welcome to spring boot";
    }
}
