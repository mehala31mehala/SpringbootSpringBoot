package com.customer.example.customer.controller;

import com.customer.example.customer.entity.CustomerEntity;
import com.customer.example.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CustomerController {
    @Autowired
    public CustomerService service;
    @PostMapping("/new")
    private String save(@RequestBody CustomerEntity customer){
        service.save(customer);
        return  "done";
    }
    @PostMapping("/seting")
    private String listall(@RequestBody List<CustomerEntity> obj1){
        CustomerEntity obj2=service.save(obj1);
        return "post";
    }
    @GetMapping("/give")
    private List<CustomerEntity> getAll(){
      return  service.getAll();

    }
    @GetMapping("/save/{id}")
     private Optional<CustomerEntity> getby(@PathVariable("id") int id){
        return service.getby(id);
    }
    @PutMapping("/puts")
    private  String update(@RequestBody CustomerEntity customer){
         service.update(customer);
         return "upd";
    }
    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable("id") int id){
        service.delete(id);
        return "super";
    }
}
