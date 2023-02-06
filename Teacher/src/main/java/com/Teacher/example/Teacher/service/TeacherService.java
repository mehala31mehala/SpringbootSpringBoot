package com.Teacher.example.Teacher.service;

import com.Teacher.example.Teacher.entity.TeacherEntity;
import com.Teacher.example.Teacher.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TeacherService {
    @Autowired
    public TeacherRepository repository;
    public String save(TeacherEntity teacher){
        repository.saveAndFlush(teacher);
        return "save";
    }
    public TeacherEntity save(List<TeacherEntity> obj1){
        List<TeacherEntity>obj2=new ArrayList<>();
        TeacherEntity obj3=null;
        for(TeacherEntity obj4:obj1){
             obj3=new TeacherEntity();
             repository.saveAndFlush(obj4);
        }
        return obj3;
    }
    public List<TeacherEntity> getall() {
      return  repository.findAll();
    }
    public Optional<TeacherEntity> getById(int id) {
        return repository.findById(id);
    }
    public void update(TeacherEntity teacher) {
        repository.saveAndFlush(teacher);
    }
    public void deleteId(int id) {
        repository.deleteById(id);
    }
}
