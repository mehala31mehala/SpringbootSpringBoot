package com.signupLogin.example.signupLogin.dto;

import java.util.UUID;

import lombok.Data;

@Data
public class UserRegistrationDto {
	//private UUID userId;
	private String userName;
	private String mailId;
	private String userPassword;
	
}
