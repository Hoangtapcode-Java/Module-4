package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {

    void save(Product product);

    List<Product> findAll();

    void delete(String idProduct);

    Product findById(String idProduct);

    void edit(String id, Product product);

    Product findByName(String name);
}
