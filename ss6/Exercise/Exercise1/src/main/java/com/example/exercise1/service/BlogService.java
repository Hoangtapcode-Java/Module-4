package com.example.exercise1.service;

import com.example.exercise1.model.Blog;
import com.example.exercise1.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BlogService implements IBlogService{
    @Autowired
    IBlogRepository iBlogRepository;


    @Override
    public List<Blog> findAll() {
        return iBlogRepository.findAll();
    }

    @Override
    public void save(Blog blog) {
        iBlogRepository.save(blog);
    }

    @Override
    public Blog findById(Integer id) {
        return iBlogRepository.findById(id).get();
    }

    @Override
    public void deleteById(Integer id) {
        iBlogRepository.deleteById(id);
    }

    @Override
    public Page<Blog> searchPage(PageRequest pageRequest,String name) {
        return iBlogRepository.findAllByName(pageRequest,name);
    }

    @Override
    public void deleteByIdCategory(Integer id) {
        iBlogRepository.deleteBlogsByCategory_IdCategory(id);
    }

    @Override
    public List<Blog> findByIdCategory(Integer id) {
        return iBlogRepository.findAllByCategory_IdCategory(id);
    }

    @Override
    public Page<Blog> findAllWithPage(PageRequest pageRequest) {
        return iBlogRepository.findAllWithPage(pageRequest);
    }

    @Override
    public List<Blog> searchWithAjax(String name) {
        return iBlogRepository.findByName("%"+name+"%");
    }


}
