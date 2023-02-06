package com.School.example.controller;

import com.School.example.entity.Staff;
import com.School.example.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StaffController {
    @Autowired
    public StaffService staffService;

    @PostMapping("/post")
    private String save(@RequestBody Staff staff){
        staffService.save(staff);
        return "yes";
    }
    @PostMapping("/list")
    private String listall(@RequestBody List<Staff> obj1){
        Staff obj2=staffService.listall(obj1);
        return "done";
    }
    @GetMapping("/get")
    private List<Staff> getAll(){
        return  staffService.getAll();
    }
    @GetMapping("/getit/{id}")
    private Optional<Staff> getby(@PathVariable("id") int id){
        return  staffService.getby(id);
    }
    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable("id") int id){
        staffService.delete(id);
        return "deleted";
    }
    @PutMapping("/put")
    private String update(@RequestBody Staff staff){
        staffService.update(staff);
        return "super";
    }
}

