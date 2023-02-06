package com.manager.example.manager.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="manager")
public class ManagerEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int manager_id;
    @Column(name="name")
    private String manager_name;
    @Column(name="age")
    private String manager_age;
    @Column(name="company")
    private String comp;
    @Column(name="salary")
    private int sal;
}
