package com.example.service;

import com.example.model.Product;
import com.example.reponsitory.IProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService implements IProductService{
    @Autowired
    IProductReponsitory iProductReponsitory;
    @Override
    public List<Product> findAll() {
        return iProductReponsitory.findAll();
    }

    @Override
    public void create(Product product) {
        iProductReponsitory.create(product);
    }

    @Override
    public void delete(int id) {
        iProductReponsitory.delete(id);
    }

    @Override
    public Product findById(int id) {
        return iProductReponsitory.findById(id);
    }

    @Override
    public void edit(Product product) {
        iProductReponsitory.edit(product);
    }

    @Override
    public List<Product> findByName(String name) {
        return iProductReponsitory.findByName(name);
    }
}
