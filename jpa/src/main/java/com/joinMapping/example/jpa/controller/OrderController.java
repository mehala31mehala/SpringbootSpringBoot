package com.joinMapping.example.jpa.controller;

import com.joinMapping.example.jpa.dto.OrderRequest;
import com.joinMapping.example.jpa.entity.Customers;
import com.joinMapping.example.jpa.repository.CustomerRepository;
import com.joinMapping.example.jpa.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/post")
    public Customers save(@RequestBody OrderRequest request){
        return customerRepository.save(request.getCustomer());
    }
    @GetMapping("/getall")
    public List<Customers> getAll(){
        return customerRepository.findAll();
    }

}