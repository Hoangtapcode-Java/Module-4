package com.example.reponsitory;

import com.example.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    void addNew(Customer customer);

    List<Customer> findAll();
}
