package com.Mobiles.example.mobiles.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="mobiles")
public class MobilesEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int mobile_id;
    @Column(name="model")
    private String mobile_model;
    @Column(name="brand")
    private String mobile_brand;
    @Column(name="price")
    private int mobile_price;

}
