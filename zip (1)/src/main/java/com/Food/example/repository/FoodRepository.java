package com.Food.example.repository;

import com.Food.example.entity.FoodCompany;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<FoodCompany,Integer> {
}
