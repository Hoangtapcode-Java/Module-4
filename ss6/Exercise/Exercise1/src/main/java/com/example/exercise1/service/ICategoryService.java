package com.example.exercise1.service;

import com.example.exercise1.model.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface ICategoryService {
    List<Category> findAll();

    void deleteById(Integer id);

    Category findById(Integer id);

    void save(Category category);
}
