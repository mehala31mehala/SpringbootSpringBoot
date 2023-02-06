package com.Productexample.product.controller;

import com.Productexample.product.entity.ProductEntity;
import com.Productexample.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ProductController {
    @Autowired
    public ProductService service;
    @PostMapping("/post")
    public String save(@RequestBody ProductEntity product){
        service.save(product);
        return "yes";
    }
    @PostMapping("/list")
    private String Listall(@RequestBody List<ProductEntity> obj1){
        ProductEntity obj2=service.save(obj1);
        return "ok";
    }
    @GetMapping("/find")
    private List<ProductEntity> getAll(){
        return service.getAll();
    }
    @GetMapping("/get/{id}")
    private Optional<ProductEntity> getId(@PathVariable("id") int id){
        return  service.getById(id);
    }
    @PutMapping("/newvalue")
    private String update(@RequestBody ProductEntity Product){
        service.update(Product);
        return "update";
    }
    @DeleteMapping("/delete/{id}")
    private void delete(@PathVariable("id") int id){
        service.delete(id);
    }

}
