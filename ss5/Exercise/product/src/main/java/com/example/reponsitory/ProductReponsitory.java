package com.example.reponsitory;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityTransaction;
import java.util.List;
@Repository
public class ProductReponsitory implements IProductReponsitory{
    @Override
    public List<Product> findAll() {
        List<Product> products = BaseReponsitory.entityManager.createQuery("select p from Product p", Product.class).getResultList();
        return products;
    }

    @Override
    public void create(Product product) {
        EntityTransaction entityTransaction = BaseReponsitory.entityManager.getTransaction();
        entityTransaction.begin();
        BaseReponsitory.entityManager.persist(product);  //merge update
        entityTransaction.commit();
    }

    @Override
    public void delete(int id) {
        Product products = BaseReponsitory.entityManager.createQuery("select p from Product p where p.idProduct = ?1", Product.class).setParameter(1,id).getSingleResult();
        EntityTransaction entityTransaction = BaseReponsitory.entityManager.getTransaction();
        entityTransaction.begin();
        BaseReponsitory.entityManager.remove(products); //merge update
        entityTransaction.commit();
    }
    @Override
    public void edit(Product product) {
        EntityTransaction entityTransaction = BaseReponsitory.entityManager.getTransaction();
        entityTransaction.begin();
        BaseReponsitory.entityManager.merge(product);  //merge update
        entityTransaction.commit();
    }


    @Override
    public Product findById(int id) {
        Product products = BaseReponsitory.entityManager.createQuery("select p from Product p where p.idProduct = ?1", Product.class).setParameter(1,id).getSingleResult();
        return products;
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = BaseReponsitory.entityManager.createQuery("select p from Product p where p.nameProduct LIKE ?1", Product.class).setParameter(1,name).getResultList();
        return products;
    }
}
