package com.example.book_management.repository;

import com.example.book_management.model.Histories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IHistoriesRepository extends JpaRepository<Histories, Integer> {

}
