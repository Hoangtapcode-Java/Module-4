package com.example.exam1.repository;

import com.example.exam1.model.Sales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ISalesRepository extends JpaRepository<Sales,Integer> {
    List<Sales> findAllByPriceLikeOrTimeBeginOrTimeEndLike(Integer price, String begin,String end);
}
