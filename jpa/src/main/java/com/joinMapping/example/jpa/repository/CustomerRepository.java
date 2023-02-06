package com.joinMapping.example.jpa.repository;

import com.joinMapping.example.jpa.entity.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customers,Integer> {
}
