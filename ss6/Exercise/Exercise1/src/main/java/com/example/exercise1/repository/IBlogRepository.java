package com.example.exercise1.repository;

import com.example.exercise1.model.Blog;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IBlogRepository extends JpaRepository<Blog,Integer>{
    @Query(value = "select * from blog b where b.name like :name",nativeQuery = true)
    Page<Blog> findAllByName(PageRequest pageRequest,@Param("name")String name);

    @Query(value = "select * from blog b where b.name like :name", nativeQuery = true)
    List<Blog> findByName(@Param("name") String name);

    @Query(value = "select * from blog b order by b.date desc ", nativeQuery = true)
    List<Blog> findAll();

    @Modifying
    @Query(value = "delete from blog b where b.category_id_category = :id",nativeQuery = true)
    void deleteBlogsByCategory_IdCategory(@Param("id")Integer id);

    @Query(value = "select * from blog b where b.category_id_category = :id",nativeQuery = true)
    List<Blog> findAllByCategory_IdCategory(@Param("id")Integer id);

    @Query(value = "select * from blog b order by b.date desc ",countQuery = "select * from blog b order by b.date desc",nativeQuery = true)
    Page<Blog> findAllWithPage(PageRequest pageRequest);
}
