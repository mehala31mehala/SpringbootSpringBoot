package com.student.example.Student.service;

import com.student.example.Student.entity.StudentData;
import com.student.example.Student.repository.StudentDataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class StudentDataService {
    @Autowired
    public StudentDataRepository repository;
    public String save(StudentData student){
        repository.saveAndFlush(student);
        return "save";
    }
    public StudentData save(List<StudentData> object1){
        List<StudentData> obj2=new ArrayList<>();
        StudentData obj3=null;
        for(StudentData obj4:object1){
            obj3=new StudentData();
            repository.saveAndFlush(obj4);
        }
        return obj3;
    }
    public List<StudentData> getall() {
        return repository.findAll();
    }

    public Optional<StudentData> getId(int id) {
        return repository.findById(id);
    }
    public void update(StudentData student) {
        repository.saveAndFlush(student);
    }

    public void delete(int id) {
        repository.deleteById(id);
    }
}
