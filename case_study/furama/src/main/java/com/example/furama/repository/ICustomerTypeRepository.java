package com.example.furama.repository;

import com.example.furama.model.CustomerType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Transactional
@Repository
public interface ICustomerTypeRepository extends JpaRepository<CustomerType,Integer> {
}
