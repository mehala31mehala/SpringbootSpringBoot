package com.customer.example.customer.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer")

public class CustomerEntity {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id")
    private int customer_Id;
    @Column(name="customer_name")
    private String customerName;
    @Column(name="customer_order")
    private String customerOrder;
    @Column(name="customer_address")
    private String customerAddress;
    @Column(name="customer_pincode")
    private int customerPinCode;

}
