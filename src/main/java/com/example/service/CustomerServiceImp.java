package com.example.service;

import com.example.model.Customer;
import com.example.repository.CustomerRepoImp;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class CustomerServiceImp implements CustomerService{
    @Autowired
    private CustomerRepoImp customerRepoImp;
    @Override
    public List<Customer> findAll() {
        return customerRepoImp.findAll();
    }

    @Override
    public Customer findByID(Long id) {
        return customerRepoImp.findbyID(id);
    }

    @Override
    public void save(Customer model) {
        customerRepoImp.save(model);
    }

    @Override
    public void remove(Long id) {
        customerRepoImp.remove(id);
    }
}
