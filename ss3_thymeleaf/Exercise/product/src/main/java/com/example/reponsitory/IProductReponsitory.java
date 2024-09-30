package com.example.reponsitory;

import com.example.model.Product;

import java.util.List;

public interface IProductReponsitory {

    void save(Product product);

    List<Product> findAll();

    void delete(String idProduct);

    Product findById(String id);

    void edit(String id, Product product);

    Product findByName(String name);
}
