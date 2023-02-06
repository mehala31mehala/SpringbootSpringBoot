package com.Teacher.example.Teacher.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="teacher")
public class TeacherEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="teacher_id")
    private int id;
    @Column(name="teacher_name")
    private String name;
    @Column(name="standard")
    private int std;
    @Column(name="subject")
    private String sub;
    @Column(name="salary")
    private int sal;
}

