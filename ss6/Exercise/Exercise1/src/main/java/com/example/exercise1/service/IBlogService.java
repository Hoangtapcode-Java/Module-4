package com.example.exercise1.service;

import com.example.exercise1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    void save(Blog blog);

    Blog findById(Integer id);

    void deleteById(Integer id);

    Page<Blog> searchPage(PageRequest pageRequest,String name);

    void deleteByIdCategory(Integer id);

    List<Blog> findByIdCategory(Integer id);

    Page<Blog> findAllWithPage(PageRequest pageRequest);

    List<Blog> searchWithAjax(String name);

}
