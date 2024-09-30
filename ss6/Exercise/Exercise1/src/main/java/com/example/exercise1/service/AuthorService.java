package com.example.exercise1.service;

import com.example.exercise1.model.Author;
import com.example.exercise1.repository.IAuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AuthorService implements IAuthorService{
    @Autowired
    IAuthorRepository iAuthorRepository;
    @Override
    public List<Author> findAll() {
        return iAuthorRepository.findAll();
    }
}
