package com.manager.example.manager.service;

import com.manager.example.manager.entity.ManagerEntity;
import com.manager.example.manager.repository.ManagerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ManagerService {
    @Autowired
    public ManagerRepository repository;
    public String save(ManagerEntity manager){
        repository.saveAndFlush(manager);
        return "ok";
    }
    public ManagerEntity save(List<ManagerEntity> obj1){
        List<ManagerEntity>obj2=new ArrayList<>();
        ManagerEntity obj3=null;
        for(ManagerEntity obj4:obj1){
            obj3=new ManagerEntity();
            repository.saveAndFlush(obj4);
        }
        return obj3;
    }

    public List<ManagerEntity> gerAll() {
        return repository.findAll();
    }
    public Optional<ManagerEntity> getany(int id) {
        return repository.findById(id);
    }

    public void update(ManagerEntity manager) {
        repository.saveAndFlush(manager);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
