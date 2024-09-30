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
    public void save(Product product) {
        iProductReponsitory.save(product);
    }

    @Override
    public List<Product> findAll() {
        return iProductReponsitory.findAll();
    }

    @Override
    public void delete(String idProduct) {
        iProductReponsitory.delete(idProduct);
    }

    @Override
    public Product findById(String idProduct) {
        return iProductReponsitory.findById(idProduct);
    }

    @Override
    public void edit(String id, Product product) {
        iProductReponsitory.edit(id,product);
    }

    @Override
    public Product findByName(String name) {
        return iProductReponsitory.findByName(name);
    }
}
