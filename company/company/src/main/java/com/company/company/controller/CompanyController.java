package com.company.company.controller;

import com.company.company.entity.Company;
import com.company.company.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class CompanyController {
    @Autowired
    private CompanyService companyService;

    @PostMapping("/insert")
    private String save(@RequestBody Company company){
        companyService.save(company);
        return  "yes";
    }
    @PostMapping("/list")
    private String listall(@RequestBody List<Company> obj1){
        Company obj2=companyService.listall(obj1);
        return "done";
    }
    @GetMapping("/get")
    private List<Company> getAll(){
        return  companyService.getAll();
    }
    @GetMapping("/getit/{id}")
    private Optional<Company> getBy(@PathVariable("id") int id){
        return  companyService.getBy(id);
    }
    @DeleteMapping("/delete/{id}")
    private String delete(@PathVariable("id") int id){
        companyService.delete(id);
        return "deleted";
    }
    @PutMapping("/put")
    private String update(@RequestBody Company company){
        companyService.update(company);
        return "super";
    }
}
