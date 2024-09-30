package com.example.ex1.model;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product,Integer> productList = new HashMap<>();
    public Cart() {
    }

    public Cart(Map<Product,Integer> productList){
        this.productList = productList;
    }

    public boolean checkIdProduct(Product product){
        for(Map.Entry<Product,Integer> product1:productList.entrySet()){
            if(product1.getKey().getIdProduct().equals(product.getIdProduct())){
                return true;
            }
        }
        return false;
    }

    public Double totalProduct(){
        Double total = Double.valueOf(0);
        for(Map.Entry<Product,Integer> products: productList.entrySet()){
            total += products.getKey().getPrice() * products.getValue();
        }
        return total;
    }

    public Map.Entry<Product,Integer> getProduct(Product product){
        for(Map.Entry<Product,Integer> products: productList.entrySet()){
            if(products.getKey().getIdProduct().equals(product.getIdProduct())){
                return products;
            }
        }
        return null;
    }

    public void addProduct(Product product){
        if(!checkIdProduct(product)){
            productList.put(product,1);
        }else{
            Map.Entry<Product,Integer> products = getProduct(product);
            Integer newQuantity = products.getValue() + 1;
            productList.replace(products.getKey(),newQuantity);
        }
    }

    public void deleteCart(Integer idProduct){
        for(Map.Entry<Product,Integer> products : productList.entrySet()){
            if(products.getKey().getIdProduct().equals(idProduct)){
                Integer newQuantity = products.getValue() - 1;
                productList.replace(products.getKey(),newQuantity);
            }
        }
    }

    public void deleteCartId(Product product){
        for(Map.Entry<Product,Integer> products : productList.entrySet()){
            if(products.getKey().getIdProduct().equals(product.getIdProduct())){
                productList.remove(product);
            }
        }

    }

    public Map<Product,Integer> getProductList(){
        return productList;
    }

}
