package com.signupLogin.example.signupLogin.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.signupLogin.example.signupLogin.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,UUID>{

}
