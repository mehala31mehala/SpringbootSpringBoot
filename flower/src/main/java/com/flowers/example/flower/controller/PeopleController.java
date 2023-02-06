package com.flowers.example.flower.controller;

import com.flowers.example.flower.entity.People;
import com.flowers.example.flower.service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class PeopleController {
    @Autowired
    public PeopleService peopleService;

    @PostMapping("/people")
    private String save(@RequestBody People people) {
        peopleService.save(people);
        return "ok";
    }
    @GetMapping("/get")
    private List<People> getAll(){
        return peopleService.getAll();
    }
    @PostMapping("/list")
    private String listAll(@RequestBody List<People> obj1){
        People obj2=peopleService.save(obj1);
        return "post";
    }
    @GetMapping("/getit/{id}")
    private Optional<People> getBy(@PathVariable("id") int id){
        return peopleService.getBy(id);
    }
    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable("id") int id){
        return peopleService.delete(id);
    }
    @PutMapping("/put")
    private String update(@RequestBody People people){
        peopleService.update(people);
        return  "ok";
    }

}