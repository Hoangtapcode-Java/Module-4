package com.example.book_management.service;

import com.example.book_management.model.Histories;
import com.example.book_management.repository.IHistoriesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistoriesService implements IHistoriesService{
    @Autowired
    IHistoriesRepository iHistoriesRepository;
    @Override
    public List<Histories> findAll() {
        return iHistoriesRepository.findAll();
    }

    @Override
    public void save(Histories histories) {
        iHistoriesRepository.save(histories);
    }
}
