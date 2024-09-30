package com.example.ex1.reponsitory;

import com.example.ex1.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IProductReponsitory extends JpaRepository<Product,Integer> {
}
