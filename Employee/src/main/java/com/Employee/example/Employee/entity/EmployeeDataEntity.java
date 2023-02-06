package com.Employee.example.Employee.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="employee")
public class EmployeeDataEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="id")
    private int employeeId;

    @Column(name="employee_name")
    private String employeeName;

    @Column(name="age")
    private int employeeAge;

    @Column(name="role")
    private String employeeRole;

    @Column(name="salary")
    private int employeeSalary;
}
