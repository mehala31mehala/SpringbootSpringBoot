package com.Employee.example.Employee.repository;

import com.Employee.example.Employee.entity.EmployeeDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<EmployeeDataEntity,Integer>{

}
