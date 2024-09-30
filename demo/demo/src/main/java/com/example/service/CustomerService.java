package com.example.service;

import com.example.model.Customer;
import com.example.reponsitory.CustomerRepository;
import com.example.reponsitory.ICustomerRepository;

import java.util.List;

public class CustomerService implements ICustomerService{
    ICustomerRepository iCustomerRepository = new CustomerRepository();
    @Override
    public void addNew(Customer customer) {
        iCustomerRepository.addNew(customer);
    }

    @Override
    public List<Customer> findAll() {
        return iCustomerRepository.findAll();
    }
}
