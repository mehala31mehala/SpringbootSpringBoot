package com.country.example.cities.controller;

import com.country.example.cities.entity.Country;
import com.country.example.cities.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CountryController {
    @Autowired
    public CountryService countryService;

    @PostMapping("/post")
    private String save(@RequestBody Country country) {
        countryService.save(country);
        return "ok";
    }
    @PostMapping("/list")
    private String  listall(@RequestBody List<Country> obj1){
        Country obj2=countryService.listall(obj1);
        return "dome";
    }
    @GetMapping("/get")
    private List<Country> getAll(){
      return  countryService.getAll();
    }
    @GetMapping("/getit/{id}")
    private Optional<Country> getby(@PathVariable("id") int id){
       return  countryService.getby(id);
    }
    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable("id") int id){
        countryService.delete(id);
        return "deleted";
    }
    @PutMapping("/put")
    private String update(@RequestBody Country country){
        countryService.update(country);
        return "super";
    }
}

