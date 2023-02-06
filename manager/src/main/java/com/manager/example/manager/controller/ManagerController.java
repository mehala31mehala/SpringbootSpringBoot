package com.manager.example.manager.controller;

import com.manager.example.manager.entity.ManagerEntity;
import com.manager.example.manager.service.ManagerService;
import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ManagerController {
    @Autowired
    public ManagerService service;
    @PostMapping("/create")
    private String save(@RequestBody ManagerEntity manager){
        service.save(manager);
        return "post";
    }
    @PostMapping("/multiple")
    private String listall(@RequestBody List<ManagerEntity> obj1){
        ManagerEntity obj2=service.save(obj1);
        return "ok0";
    }
    @GetMapping("/getpost")
    private List<ManagerEntity> getAll(){
        return service.gerAll();
    }
    @GetMapping("/fetch/{id}")
    private Optional<ManagerEntity> getany(@PathVariable("id") int id){
        return  service.getany(id);
    }
    @PutMapping("/putit")
    private String update(@RequestBody ManagerEntity manager){
        service.update(manager);
        return "save";
    }
    @DeleteMapping("/deletid/{id}")
    private String delete(@PathVariable("id") int id){
        service.delete(id);
        return "yes";
    }
}
