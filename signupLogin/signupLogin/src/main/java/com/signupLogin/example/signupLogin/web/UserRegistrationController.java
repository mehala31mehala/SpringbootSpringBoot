package com.signupLogin.example.signupLogin.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.signupLogin.example.signupLogin.dto.UserRegistrationDto;
import com.signupLogin.example.signupLogin.service.UserService;

@RestController
@RequestMapping("/registration")
public class UserRegistrationController {
	@Autowired
	 private UserService userService;

	public UserRegistrationController(UserService userService) {
		super();
		this.userService = userService;
	}
	
	public String registerUserAccount(@ModelAttribute("user") UserRegistrationDto registrationDto) {
		userService.save(registrationDto);
		return "redirect:/registration?success";
	}

}
