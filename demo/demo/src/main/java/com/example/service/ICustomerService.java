package com.example.service;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerService {
    void addNew(Customer customer);

    List<Customer> findAll();
}
