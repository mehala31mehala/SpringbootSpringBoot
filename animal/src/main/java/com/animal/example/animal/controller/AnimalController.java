package com.animal.example.animal.controller;

import com.animal.example.animal.entity.AnimalEntity;
import com.animal.example.animal.service.AnimalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class AnimalController {
    @Autowired
    public AnimalService service;

    @PostMapping("/set")
    private String Save(@RequestBody AnimalEntity animal) {
        service.save(animal);
        return "ok";
    }

    @PostMapping("/post")
    private String list(@RequestBody List<AnimalEntity> obj1) {
        AnimalEntity obj3 = service.save(obj1);
        return "done";
    }

    @GetMapping("/get")
    private List<AnimalEntity> getall() {
        return service.getall();
    }

    @GetMapping("/getit/{id}")
    private Optional<AnimalEntity> getby(@PathVariable("id") int id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable("id") int id) {
        service.deleteById(id);
        return "yes";
    }

    @PutMapping("/update")
    private String update(@RequestBody AnimalEntity animal) {
        service.update(animal);
        return "update";
    }
}