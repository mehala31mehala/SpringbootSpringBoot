package com.Mobiles.example.mobiles.service;

import com.Mobiles.example.mobiles.entity.MobilesEntity;
import com.Mobiles.example.mobiles.repository.MobilesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MobilesService {
    @Autowired
    public MobilesRepository repository;

    public String save(MobilesEntity mobile) {
        repository.saveAndFlush(mobile);
        return "save";
    }

    public MobilesEntity save(List<MobilesEntity> obj1) {
        List<MobilesEntity> obj2 = new ArrayList<>();
        MobilesEntity obj3 = null;
        for (MobilesEntity obj4 : obj1) {
            obj3 = new MobilesEntity();
            repository.saveAndFlush(obj4);
        }
        return obj3;
    }

    public List<MobilesEntity> getall() {
        return repository.findAll();

    }
    public String getbyid(int id) {
       repository.findById(id);
       return "ok";
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
    public void update(MobilesEntity mobile){
        repository.saveAndFlush(mobile);
    }

}
