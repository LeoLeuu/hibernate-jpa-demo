package com.example.service;

import com.example.model.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer findByID(Long id);
    void save(Customer model);
    void remove(Long id);
}
