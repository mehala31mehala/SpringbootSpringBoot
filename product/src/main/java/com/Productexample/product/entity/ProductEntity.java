package com.Productexample.product.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Generated;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="product")
public class ProductEntity {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   @Column(name="product_id")
   private int id;
   @Column(name="product_name")
   private String productName;
   @Column(name="product_Quantity")
   private float quantity;
   @Column(name="product_brand")
   private String brand;
   @Column(name="product_price")
   private int price;
}
