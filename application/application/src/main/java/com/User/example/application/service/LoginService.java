package com.User.example.application.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.User.example.application.entity.Login;
import com.User.example.application.repository.LoginRepository;


@Service
public class LoginService {

    @Autowired
    private LoginRepository loginRepository;

    public String save(Login login){

        login.setAndEncryptPassword(login.getPassword());
        loginRepository.saveAndFlush(login);
        return "success";
    }
}