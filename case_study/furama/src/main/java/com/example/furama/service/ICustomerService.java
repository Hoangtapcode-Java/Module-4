package com.example.furama.service;

import com.example.furama.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface ICustomerService {
    void save(Customer customer);

    Page<Customer> findAll(String name,PageRequest pageRequest);

    Page<Customer> find(PageRequest pageRequest);

    void deleteById(Integer id);

    Customer findById(Integer id);

    Page<Customer> findAllByName(String name,PageRequest pageRequest,Integer id);
}
