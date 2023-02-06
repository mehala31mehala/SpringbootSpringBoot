package com.flowers.example.flower.service;

import com.flowers.example.flower.entity.People;
import com.flowers.example.flower.repository.PeopleRepository;
import com.flowers.example.flower.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class PeopleService {
    @Autowired
    private PeopleRepository peopleRepository;
    @Autowired
    private ProductRepository productRepository;

    public String save(People people) {
        peopleRepository.saveAndFlush(people);
        return "Ok";
    }

    public List<People> getAll() {
      return  peopleRepository.findAll();
    }
    public People save(List<People> obj1){
        List<People>obj2=new ArrayList<>();
        People obj3=null;
        for(People obj4:obj1){
            obj3=new People();
            peopleRepository.saveAndFlush(obj4);
        }
        return obj3;
    }

    public Optional<People> getBy(int id) {
        return peopleRepository.findById(id);
    }

    public String delete(int id) {
         peopleRepository.deleteById(id);
         return "ok";
    }

    public void update(People people) {
        peopleRepository.saveAndFlush(people);
    }
}