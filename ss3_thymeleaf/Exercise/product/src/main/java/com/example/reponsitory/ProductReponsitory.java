package com.example.reponsitory;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class ProductReponsitory implements IProductReponsitory{

    private static List<Product> productList;

    static {
        productList = new ArrayList<>();
        productList.add(new Product("P001","Tủ Lạnh",100000,"New","Sony"));
        productList.add(new Product("P002","Máy Giặt",1500000,"New","Sony"));
        productList.add(new Product("P003","Điều Hòa",2200000,"New","LG"));
        productList.add(new Product("P004","Quạt Phun Sương",550000,"New","Samsung"));
    }
    @Override
    public void save(Product product) {
        productList.add(product);
    }

    @Override
    public List<Product> findAll() {
        return productList;
    }

    @Override
    public void delete(String idProduct) {
        for(int i = 0; i < productList.size(); i++) {
            if(productList.get(i).getIdProduct().equals(idProduct)){
                productList.remove(i);
            }
        }
    }

    @Override
    public Product findById(String id) {
        Product products = new Product();
        for(Product product:productList){
            if(product.getIdProduct().equals(id)){
                products = product;
            }
        }
        return products;
    }

    @Override
    public void edit(String id, Product product) {
        int index = 0;
        for(int i = 0;i < productList.size();i++){
            if(productList.get(i).getIdProduct().equals(id)){
                index = i;
            }
        }
        productList.set(index,product);
    }

    @Override
    public Product findByName(String name) {
        Product products = new Product();
        for(Product product:productList){
            if(product.getNameProduct().equals(name)){
                products = product;
            }
        }
        return products;
    }
}
