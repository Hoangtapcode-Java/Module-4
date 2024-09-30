package com.example.furama.service;

import com.example.furama.model.Customer;
import com.example.furama.repository.ICustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService implements ICustomerService{

    @Autowired
    ICustomerRepository iCustomerRepository;
    @Override
    public void save(Customer customer) {
        iCustomerRepository.save(customer);
    }

    @Override
    public Page<Customer> findAll(String name,PageRequest pageRequest) {
        return iCustomerRepository.findAllByNameCustomerLike("%" + name + "%", pageRequest);
    }

    @Override
    public Page<Customer> find(PageRequest pageRequest) {
        return iCustomerRepository.findAll(pageRequest);
    }

    @Override
    public void deleteById(Integer id) {
        iCustomerRepository.deleteById(id);
    }

    @Override
    public Customer findById(Integer id) {
        return iCustomerRepository.findById(id).get();
    }

    @Override
    public Page<Customer> findAllByName(String name,PageRequest pageRequest,Integer id) {
        return iCustomerRepository.findByNameCustomerLikeAndCustomerType_IdLike("%" + name + "%",pageRequest,id);
    }
}
