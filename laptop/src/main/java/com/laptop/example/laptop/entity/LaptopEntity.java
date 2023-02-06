package com.laptop.example.laptop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="laptop")
public class LaptopEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int laptopId;
    @Column(name="laptop_Brand")
    private String laptopBrand;
    @Column(name="laptop_price")
    private int laptopPrice;
}
