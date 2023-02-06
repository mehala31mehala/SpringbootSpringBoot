package com.User.example.encrypt.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.User.example.encrypt.util.PasswordUtil;

import javax.persistence.*;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="user")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int userId;
	@Column(name = "user_name")
	private String userName;
	@Column(name = "phone_no")
	private String phoneNumber;
	@Column(name = "e_mail")
	private String mailId;
	@Column(name = "password")
	private String userPassword;

	public void setAndEncryptPassword(String password) {
		setUserPassword(PasswordUtil.getEncryptedPassword(password));
	}
}
