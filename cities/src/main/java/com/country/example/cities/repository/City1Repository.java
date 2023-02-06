package com.country.example.cities.repository;

import com.country.example.cities.entity.City1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface City1Repository extends JpaRepository<City1,Integer> {
}

