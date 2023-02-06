package com.Employee.example.Employee.service;

import com.Employee.example.Employee.entity.EmployeeDataEntity;
import com.Employee.example.Employee.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;

    public String save(EmployeeDataEntity employee) {
        repository.saveAndFlush(employee);
        return "yes";
    }

    public List<EmployeeDataEntity> getAll() {
        return repository.findAll();
    }

    public Optional<EmployeeDataEntity> getById(int id) {
        return repository.findById(id);
    }

    public String update(EmployeeDataEntity employee) {

        repository.saveAndFlush(employee);
        return "update";
    }

    public void delete(int id) {
        repository.deleteById(id);
    }

    public EmployeeDataEntity save(List<EmployeeDataEntity> obj1) {
        List<EmployeeDataEntity> Obj2 = new ArrayList<>();
        EmployeeDataEntity Obj3 = null;
        for (EmployeeDataEntity obj4 : obj1) {
            Obj3 = new EmployeeDataEntity();
            repository.saveAndFlush(obj4);
        }
        return Obj3;
    }
}