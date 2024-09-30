package com.example.book_management.service;

import com.example.book_management.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> findAll();

    void addNew(Book book);

    Book findById(Integer id);
}
