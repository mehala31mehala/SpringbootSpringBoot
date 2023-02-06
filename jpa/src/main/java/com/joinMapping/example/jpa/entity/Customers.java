package com.joinMapping.example.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Customers {
    @Id
    @GeneratedValue
    private int id;
    private String customerName;
    private String email;
    private String gender;
    @OneToMany(targetEntity = Products.class,cascade= CascadeType.ALL)
    @JoinColumn(name="cp_fk",referencedColumnName = "id")
    private List<Products> products;
}
