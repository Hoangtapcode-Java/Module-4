package com.example.reponsitory;

import com.example.model.Product;

import java.util.List;

public interface IProductReponsitory {

    List<Product> findAll();

    void create(Product product);

    void delete(int id);

    void edit(Product product);

    Product findById(int id);

    List<Product> findByName(String name);
}
