package com.student.example.Student.controller;

import com.student.example.Student.entity.StudentData;
import com.student.example.Student.service.StudentDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentDataController {
    @Autowired
    public StudentDataService  service;
    @PostMapping("/give")
    private String save(@RequestBody StudentData student){
        service.save(student);
        return "done";
    }
    @PostMapping("/givelist")
    private String listall(@RequestBody List<StudentData> object1){
        StudentData obj2=service.save(object1);
        return "saved";
    }
    @GetMapping("/getdata")
    private List<StudentData> getall(){
        return service.getall();
    }
    @GetMapping("/getdata/{id}")
    private Optional<StudentData> getId(@PathVariable("id") int id){
        return service.getId(id);
    }
    @PutMapping("/upd")
    private String update(@RequestBody StudentData student){
        service.update(student);
        return "ok";
    }
    @DeleteMapping("/drop/{id}")
    private void delete(@PathVariable("id") int id){
        service.delete(id);
    }
}
