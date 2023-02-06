package com.User.example.encrypt.dto;

import java.io.Serializable;
import java.util.UUID;

import lombok.Data;

@Data
public class SignUpDto  implements Serializable{
	private static final long serialVersionUID = 1L;

    private UUID userId; 
	private String userName;
	private String phoneNumber;
	private String mailId;
	private String userPassword;	

}
