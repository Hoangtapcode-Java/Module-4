package com.example.ex1.service;

import com.example.ex1.model.Smartphones;

import java.util.List;

public interface ISmartphoneService {
    List<Smartphones> findAll();

    void save(Smartphones smartphones);

    void deleteById(Integer id);

    Smartphones findById(Integer id);
}
