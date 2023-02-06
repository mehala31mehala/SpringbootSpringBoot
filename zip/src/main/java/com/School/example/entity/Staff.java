package com.School.example.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GeneratorType;
import org.hibernate.annotations.ValueGenerationType;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="staffs")
public class Staff {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int staffId;
    @Column(name="name")
    private String staffName;
    @Column(name="age")
    private int staffAge;
    @Column(name="subject")
    private String staffSubject;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="teacher_id")
    private List<Student> student;


}
