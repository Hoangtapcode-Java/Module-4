package com.example.exam1.service;

import com.example.exam1.model.Sales;
import com.example.exam1.repository.ISalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalesService implements ISalesService{

    @Autowired
    ISalesRepository iSalesRepository;
    @Override
    public List<Sales> findAll() {
        return iSalesRepository.findAll();
    }

    @Override
    public void addNew(Sales sales) {
        iSalesRepository.save(sales);
    }

    @Override
    public void deleteById(Integer id) {
        iSalesRepository.deleteById(id);
    }

    @Override
    public Sales findById(Integer id) {
        return iSalesRepository.findById(id).orElse(null);
    }

    @Override
    public List<Sales> findByPrice(Integer price, String begin,String end) {
        return iSalesRepository.findAllByPriceLikeOrTimeBeginOrTimeEndLike(price,begin,end);
    }


}
