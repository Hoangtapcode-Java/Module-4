package com.example.product.service;

import com.example.product.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public interface IProductService {
    Page<Product> findAll(PageRequest pageRequest);

    void save(Product product);

    void delete(Integer id);

    Product findById(Integer id);
}