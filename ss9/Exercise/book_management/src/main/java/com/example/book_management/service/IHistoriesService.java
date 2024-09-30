package com.example.book_management.service;

import com.example.book_management.model.Histories;

import java.util.List;

public interface IHistoriesService {
    List<Histories> findAll();

    void save(Histories histories);
}
