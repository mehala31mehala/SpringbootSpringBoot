package com.country.example.cities.service;

import com.country.example.cities.entity.Country;
import com.country.example.cities.repository.City1Repository;
import com.country.example.cities.repository.City2Repository;
import com.country.example.cities.repository.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CountryService {
    @Autowired
    private CountryRepository countryRepository;
    @Autowired
    private City1Repository city1Repository;
    @Autowired
    private City2Repository city2Repository;

    public String save(Country country){
        countryRepository.saveAndFlush(country);
        return "ok";
    }

    public Country listall(List<Country> obj1) {
        List<Country> obj2=new ArrayList<>();
        Country obj3=null;
        for(Country obj4:obj1){
            obj3=new Country();
            countryRepository.save(obj4);
        }
        return obj3;
    }

    public List<Country> getAll() {
       return countryRepository.findAll();
    }

    public Optional<Country> getby( int id) {
        return countryRepository.findById(id);
    }

    public void delete(int id) {
        countryRepository.deleteById(id);
    }

    public void update(Country country) {
        countryRepository.saveAndFlush(country);
    }
}

