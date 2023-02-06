package com.student.example.Student.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="student_details")
public class StudentData {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="student_id")
    private int id;
    @Column(name="student_name")
    private String name;
    @Column(name="student_age")
    private int age;
    @Column(name="student_rollno")
    private int roll_no;
    @Column(name="student_std")
    private String standard;
    @Column(name="address")
    private String add;






}
