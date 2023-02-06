package com.laptop.example.laptop.controller;

import com.laptop.example.laptop.entity.LaptopEntity;
import com.laptop.example.laptop.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopController {
    @Autowired
    public LaptopService service;
    @PostMapping("/rate")
    private String save(@RequestBody LaptopEntity laptop){
        service.save(laptop);
        return "ok";
    }
    @PostMapping("/post")
    private String list(@RequestBody List<LaptopEntity> obj1){
        LaptopEntity obj2=service.save(obj1);
        return "done";
    }
    @GetMapping("/getit")
    private List<LaptopEntity> getAll(){
        return service.getAll();
    }
    @GetMapping("/getbyid/{id}")
    private Optional<LaptopEntity> getby(@PathVariable("id") int id){
        return service.getbyid(id);
    }
    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable("id") int id){
       service.deleteById(id);
       return "deleted";
    }
    @PutMapping("/update")
    private String update(@RequestBody LaptopEntity laptop){
        service.update(laptop);
        return "done";
    }
}
