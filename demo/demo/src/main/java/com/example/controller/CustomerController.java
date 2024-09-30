package com.example.controller;

import com.example.model.Customer;
import com.example.reponsitory.ICustomerRepository;
import com.example.service.CustomerService;
import com.example.service.ICustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class CustomerController {
    ICustomerService iCustomerService = new CustomerService();

    @GetMapping("/customer")
    public String findAll(Model model){
        List<Customer> customers = iCustomerService.findAll();
        model.addAttribute("customer",customers);
        return "/list";
    }
}
