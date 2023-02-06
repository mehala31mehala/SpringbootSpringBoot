package com.animal.example.animal.service;

import com.animal.example.animal.entity.AnimalEntity;
import com.animal.example.animal.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {
    @Autowired
    public AnimalRepository repository;
    public String save(AnimalEntity animal){
        repository.saveAndFlush(animal);
        return "save";
    }
    public AnimalEntity save(List<AnimalEntity> obj1){
        List<AnimalEntity> obj2=new ArrayList<>();
       AnimalEntity obj3=null;
        for(AnimalEntity obj4:obj1){
            obj3= new AnimalEntity();
            repository.saveAndFlush(obj4);
        }
        return obj3;
    }

    public List<AnimalEntity> getall() {
        return repository.findAll();
    }

    public Optional<AnimalEntity> getById(int id) {
        return repository.findById(id);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }

    public String update(AnimalEntity animal) {
        repository.saveAndFlush(animal);
        return "ok";
    }
}

