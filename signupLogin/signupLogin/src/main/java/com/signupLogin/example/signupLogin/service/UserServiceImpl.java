package com.signupLogin.example.signupLogin.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.signupLogin.example.signupLogin.dto.UserRegistrationDto;
import com.signupLogin.example.signupLogin.entity.User;
import com.signupLogin.example.signupLogin.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	
	private UserRepository userRepository;
	
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public User save(UserRegistrationDto registrationDto) {
		User user=new User( registrationDto.getUserName(),registrationDto.getMailId(),registrationDto.getUserPassword());
		return userRepository.save(user);
	}


}
