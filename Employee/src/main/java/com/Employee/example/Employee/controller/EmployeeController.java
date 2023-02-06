package com.Employee.example.Employee.controller;


import com.Employee.example.Employee.entity.EmployeeDataEntity;
import com.Employee.example.Employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;

    @PostMapping("/postSave")
    private String save(@RequestBody EmployeeDataEntity employee) {
        service.save(employee);
        return "OK";
    }

    @GetMapping("/get")
    private List<EmployeeDataEntity> getAll() {
        return service.getAll();
    }

    @GetMapping("/get/{id}")
    private Optional<EmployeeDataEntity> getId(@PathVariable("id") int id) {
        return service.getById(id);
    }

    @DeleteMapping("/delete/{id}")
    private void deleteId(@PathVariable("id") int id) {
        service.delete(id);
    }

    @PutMapping("/update")
    private String update(@RequestBody EmployeeDataEntity employee) {
        service.update(employee);
        return "Update";
    }

    @PostMapping("/ListALl")
    private String ListALl(@RequestBody List<EmployeeDataEntity> obj1) {
        EmployeeDataEntity Obj2 = service.save(obj1);
        return "ListALl";
    }
}

