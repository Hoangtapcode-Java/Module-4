package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {

    List<Product> findAll();

    void create(Product product);

    void delete(int id);

    Product findById(int id);

    void edit(Product product);

    List<Product> findByName(String name);
}
