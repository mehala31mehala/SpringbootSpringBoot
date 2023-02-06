package com.signupLogin.example.signupLogin.service;

import com.signupLogin.example.signupLogin.dto.UserRegistrationDto;
import com.signupLogin.example.signupLogin.entity.User;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
