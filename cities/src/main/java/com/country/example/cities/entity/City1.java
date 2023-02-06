package com.country.example.cities.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="city1")
public class City1 {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="city_id")
    private int cityId;
    @Column(name="city_name")
    private String cityName;

    @ManyToOne(cascade = CascadeType.ALL)
    private Country country;
}



