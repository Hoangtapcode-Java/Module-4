package com.example.ex1.repository;

import com.example.ex1.model.Smartphones;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface ISmartPhonesRepository extends JpaRepository<Smartphones,Integer> {

}
