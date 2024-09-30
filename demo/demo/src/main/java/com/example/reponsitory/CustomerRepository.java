package com.example.reponsitory;

import com.example.model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepository implements ICustomerRepository{
    private static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(0,"Võ Văn Hoàng","hoang123@gmail.com","Đà Nẵng"));
        customerList.add(new Customer(1,"Hoàng Văn Chiến","chien@gmail.com","Đà Nẵng"));
        customerList.add(new Customer(2,"Lê Văn Tám","tam@gmail.com","Quãng Ngãi"));
    }
    @Override
    public void addNew(Customer customer) {
        customerList.add(customer);
    }

    @Override
    public List<Customer> findAll() {
        return customerList;
    }
}
