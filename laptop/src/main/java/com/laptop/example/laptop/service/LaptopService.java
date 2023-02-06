package com.laptop.example.laptop.service;

import com.laptop.example.laptop.entity.LaptopEntity;
import com.laptop.example.laptop.repository.LaptopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class LaptopService {
    @Autowired
    public LaptopRepository repository;
    public String save(LaptopEntity laptop){
        repository.saveAndFlush(laptop);
        return "save";
    }
    public  LaptopEntity save(List<LaptopEntity> obj1){
        List<LaptopEntity> obj2=new ArrayList<>();
        LaptopEntity obj3=null;
        for(LaptopEntity obj4:obj1){
            obj3=new LaptopEntity();
            repository.saveAndFlush(obj4);
        }
        return obj3;
    }

    public List<LaptopEntity> getAll() {
        return repository.findAll();
    }

    public Optional<LaptopEntity> getbyid(int id) {
       return repository.findById(id);
    }

    public void deleteById(int id) {
         repository.deleteById(id);
    }

    public void update(LaptopEntity laptop) {
        repository.saveAndFlush(laptop);
    }
}
