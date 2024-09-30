package com.example.ex1.service;

import com.example.ex1.model.Product;
import com.example.ex1.reponsitory.IProductReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    IProductReponsitory iProductReponsitory;
    @Override
    public void addProduct(Product product) {
        iProductReponsitory.save(product);
    }

    @Override
    public List<Product> findAll() {
        return iProductReponsitory.findAll();
    }

    @Override
    public Product findById(Integer idProduct) {
        return iProductReponsitory.findById(idProduct).get();
    }
}
