package com.example.exercise1.repository;

import com.example.exercise1.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface IAuthorRepository extends JpaRepository<Author,Integer> {
}
