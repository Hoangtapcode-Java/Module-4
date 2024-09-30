package com.example.ex1.service;

import com.example.ex1.model.Product;

import java.util.List;

public interface IProductService {
    void addProduct(Product product);

    List<Product> findAll();

    Product findById(Integer idProduct);
}
