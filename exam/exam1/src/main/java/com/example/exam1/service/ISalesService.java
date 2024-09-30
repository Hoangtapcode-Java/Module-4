package com.example.exam1.service;

import com.example.exam1.model.Sales;

import java.util.List;

public interface ISalesService {
    List<Sales> findAll();

    void addNew(Sales sales);

    void deleteById(Integer id);

    Sales findById(Integer id);

    List<Sales> findByPrice(Integer price, String begin,String end);
}
