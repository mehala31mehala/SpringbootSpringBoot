package com.School.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student")

public class Student {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int studentId;
    @Column(name="name")
    private String studentName;
    @Column(name="standard")
    private int studentStandard;
    @Column(name="age")
    private int studentAge;
}
