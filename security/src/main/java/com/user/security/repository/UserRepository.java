package com.user.security.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.user.security.dto.SignUpDTO;
import com.user.security.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User,UUID>{

	Optional<User> findByUserName(String userName);


}
