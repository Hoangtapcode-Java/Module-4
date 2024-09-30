package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements IProductService {
    @Autowired
    IProductRepository iProductRepository;
    @Override
    public Page<Product> findAll(PageRequest pageRequest) {
        return iProductRepository.findAll(pageRequest);
    }

    @Override
    public void save(Product product) {
        iProductRepository.save(product);
    }

    @Override
    public void delete(Integer id) {
        iProductRepository.deleteById(id);
    }

    @Override
    public Product findById(Integer id) {
        return iProductRepository.findById(id).get();
    }


}
