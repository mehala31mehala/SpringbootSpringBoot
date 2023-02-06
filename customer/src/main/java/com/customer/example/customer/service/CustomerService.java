package com.customer.example.customer.service;

import com.customer.example.customer.entity.CustomerEntity;
import com.customer.example.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    public CustomerRepository repository;
    public String save(CustomerEntity customer){
        repository.saveAndFlush(customer);
        return "yes";
    }
    public CustomerEntity save(List<CustomerEntity> obj1){
        List<CustomerEntity> obj2=new ArrayList<>();
        CustomerEntity obj3=null;
        for(CustomerEntity obj4:obj1){
            obj3=new CustomerEntity();
            repository.saveAndFlush(obj4);
        }
        return obj3;
    }

    public List<CustomerEntity> getAll() {
      return  repository.findAll();
    }

    public Optional<CustomerEntity> getby(int id) {
        return repository.findById(id);
    }

    public void update(CustomerEntity customer) {
         repository.saveAndFlush(customer);
    }
    public void delete(int id) {
        repository.deleteById(id);
    }
}
