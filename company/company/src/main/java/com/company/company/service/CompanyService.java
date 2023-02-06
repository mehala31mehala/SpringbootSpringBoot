package com.company.company.service;

import com.company.company.entity.Company;
import com.company.company.repository.CompanyRepository;
import com.company.company.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CompanyService {
    @Autowired
    private CompanyRepository companyRepository;
    @Autowired
    private EmployeeRepository employeeRepository;

    public String save(Company company){
        companyRepository.saveAndFlush(company);
        return "ok";
    }
    public  Company listall(List<Company> obj1) {
        List<Company> obj2=new ArrayList<>();
        Company obj3=null;
        for(Company obj4:obj1){
            obj3=new Company();
            companyRepository.save(obj4);
        }
        return obj3;
    }

    public List<Company> getAll() {
        return companyRepository.findAll();
    }

    public Optional<Company> getBy(int id) {
        return companyRepository.findById(id);
    }

    public void delete(int id) {
        companyRepository.deleteById(id);
    }

    public void update(Company country) {
        companyRepository.saveAndFlush(country);
    }
}

