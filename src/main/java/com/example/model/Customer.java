package com.example.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Data
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
//    private Set<Product> listProduct = new HashSet<>();
    @ManyToMany()
//    @JoinTable(name = "customer-product", joinColumns = @JoinColumn(name = "customer_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
    private Collection<Product> products;
}
