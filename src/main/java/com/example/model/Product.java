package com.example.model;

import lombok.*;

import javax.persistence.*;
import java.util.Collection;

@Data
@Entity
@Getter @Setter @NoArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nameProduct;
    @ManyToMany(mappedBy = "products")
    private Collection<Customer> customers;
}
