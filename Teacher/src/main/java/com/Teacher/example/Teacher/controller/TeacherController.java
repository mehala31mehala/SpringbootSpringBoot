package com.Teacher.example.Teacher.controller;

import com.Teacher.example.Teacher.entity.TeacherEntity;
import com.Teacher.example.Teacher.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class TeacherController {
    @Autowired
    public TeacherService service;

    @PostMapping("/save")
    private String save(@RequestBody TeacherEntity teacher){
         service.save(teacher);
        return "success";
    }
    @PostMapping("/listdata")
    private String list(@RequestBody List<TeacherEntity> obj1){
        TeacherEntity obj2=service.save(obj1);
        return "listby";
    }
    @GetMapping("/have")
    private List<TeacherEntity> getall(){
        return service.getall();
    }
    @GetMapping("/fetch/{id}")
    private Optional<TeacherEntity> getById(@PathVariable("id") int id){
        return service.getById(id);
    }
    @PutMapping("/insert")
    private String update(@RequestBody TeacherEntity teacher){
        service.update(teacher);
        return "updated";
    }
    @DeleteMapping("/clear/{id}")
    private String deleteid(@PathVariable("id") int id){
        service.deleteId(id);
        return "deleted";
    }
}
