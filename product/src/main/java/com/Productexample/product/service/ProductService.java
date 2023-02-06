package com.Productexample.product.service;

import com.Productexample.product.entity.ProductEntity;
import com.Productexample.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    public ProductRepository repository;
    public String save(ProductEntity product){
         repository.saveAndFlush(product);
         return "save";
    }
    public ProductEntity save(List<ProductEntity> obj1){
     List<ProductEntity> obj2=new ArrayList<>();
     ProductEntity obj3=null;
     for(ProductEntity obj4:obj1){
         obj3=new ProductEntity();
         repository.saveAndFlush(obj4);
     }
     return obj3;
    }
    public List<ProductEntity> getAll() {
        return repository.findAll();
    }

    public Optional<ProductEntity> getById(int id) {
        return repository.findById(id);
    }

    public String  update(ProductEntity product) {
         repository.saveAndFlush(product);
         return "update";
    }
    public void delete(int id) {
        repository.deleteById(id);
    }
}
