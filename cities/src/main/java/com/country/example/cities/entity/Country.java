package com.country.example.cities.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="country")
public class Country {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int countryId;
    @Column(name="country_name")
    private String name;
    @Column(name="country_code")
    private int code;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="country_id")
    private List<City1> city1;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name="country_id")
    private List<City2> city2;


}


