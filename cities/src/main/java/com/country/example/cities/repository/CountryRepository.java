package com.country.example.cities.repository;

import com.country.example.cities.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
 public interface CountryRepository extends JpaRepository<Country,Integer> {
}

