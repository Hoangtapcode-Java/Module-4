package com.example.ex1.service;

import com.example.ex1.model.Smartphones;
import com.example.ex1.repository.ISmartPhonesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SmartphonesService implements ISmartphoneService{
    @Autowired
    ISmartPhonesRepository iSmartPhonesRepository;
    @Override
    public List<Smartphones> findAll() {
        return iSmartPhonesRepository.findAll();
    }

    @Override
    public void save(Smartphones smartphones) {
        iSmartPhonesRepository.save(smartphones);
    }

    @Override
    public void deleteById(Integer id) {
        iSmartPhonesRepository.deleteById(id);
    }

    @Override
    public Smartphones findById(Integer id) {
        return iSmartPhonesRepository.findById(id).get();
    }
}
