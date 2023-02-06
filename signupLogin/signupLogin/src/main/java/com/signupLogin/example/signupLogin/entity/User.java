package com.signupLogin.example.signupLogin.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import java.util.UUID;

import javax.persistence.*;
import javax.persistence.UniqueConstraint;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user",uniqueConstraints=@UniqueConstraint(columnNames="email"))

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "id")
	private UUID userId;
	public User(String userName, String mailId, String userPassword) {
		super();
		this.userName = userName;
		this.mailId = mailId;
		this.userPassword = userPassword;
	}
	@Column(name = "user_name")
	private String userName;
	@Column(name = "email")
	private String mailId;
	@Column(name = "password")
	private String userPassword;

	//public void setAndEncryptPassword(String password) {
		//setUserPassword(PasswordUtil.getEncryptedPassword(password));
	}

