package com.example.furama.repository;

import com.example.furama.model.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ICustomerRepository extends JpaRepository<Customer,Integer> {
//    @Query(value = "select * from customer c where c.name_customer like :name",countQuery = "select * from customer c where c.name_customer like :name",nativeQuery = true)
//    Page<Customer> findByNameCustomerLikeAndCustomerType_IdLike(String name, PageRequest pageRequest,Integer id);
    Page<Customer> findByNameCustomerLikeAndCustomerType_IdLike(String name, PageRequest pageRequest,Integer id);
    Page<Customer> findAllByNameCustomerLike(String name, PageRequest pageRequest);
}
