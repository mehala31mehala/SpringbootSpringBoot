package com.country.example.cities.repository;

import com.country.example.cities.entity.City2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface City2Repository extends JpaRepository<City2,Integer> {
}
