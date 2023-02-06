package com.User.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.User.example.application.entity.Login;

@Repository
public interface LoginRepository extends JpaRepository<Login,Integer> {

}
