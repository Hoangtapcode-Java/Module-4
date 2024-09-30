package com.example.exercise1.service;

import com.example.exercise1.model.Category;
import com.example.exercise1.repository.ICategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CategoryService implements ICategoryService{
    @Autowired
    ICategoryRepository iCategoryRepository;
    @Override
    public List<Category> findAll() {
        return iCategoryRepository.findAll();
    }

    @Override
    public void deleteById(Integer id) {
        iCategoryRepository.deleteById(id);
    }

    @Override
    public Category findById(Integer id) {
        return iCategoryRepository.findById(id).get();
    }

    @Override
    public void save(Category category) {
        iCategoryRepository.save(category);
    }


}
