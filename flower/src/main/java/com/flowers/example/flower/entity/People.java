package com.flowers.example.flower.entity;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="people")
public class People {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
@Column(name="id")
private int people_id;
@Column(name="people_name")
private String peopleName;
@Column(name="people_age")
private String peopleAge;
@OneToMany(cascade = CascadeType.ALL)
@JoinColumn(name ="product_id")
private List<Product> product;

}
