package com.example.book_management.service;

import com.example.book_management.model.Person;
import com.example.book_management.repository.IPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService implements IPersonService{
    @Autowired
    IPersonRepository iPersonRepository;
    @Override
    public List<Person> findAll() {
        return iPersonRepository.findAll();
    }

    @Override
    public void save(Person person) {
        iPersonRepository.save(person);
    }
}
