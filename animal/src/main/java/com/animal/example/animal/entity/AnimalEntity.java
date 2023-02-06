package com.animal.example.animal.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="animals")
public class AnimalEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int animalId;
    @Column(name="animal_name")
    private String animalName;
    @Column(name="animal_color")
    private String animalColor;
    @Column(name="animal_food")
    private String animalFood;
}
