package com.User.example.encrypt.service;

import java.util.ArrayList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.User.example.encrypt.entity.User;
import com.User.example.encrypt.repository.UserRepository;
import com.medical.video.repository.OneTimePasswordRepository;
import com.medical.video.repository.RoleRepository;

import lombok.AllArgsConstructor;
import lombok.NonNull;

@Service
@Transactional
@AllArgsConstructor(onConstructor_ = { @Autowired })

public class UserService {

	 @Autowired
	    private UserRepository userRepository;
	 
			public String save(User user) {
				userRepository.save(user);
				return "yes";
			}
	public List<User> getAll() {
		return userRepository.findAll();
	}



}



