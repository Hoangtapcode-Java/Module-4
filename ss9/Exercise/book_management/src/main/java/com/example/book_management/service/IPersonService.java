package com.example.book_management.service;

import com.example.book_management.model.Person;

import java.util.List;

public interface IPersonService {
    List<Person> findAll();

    void save(Person person);
}
