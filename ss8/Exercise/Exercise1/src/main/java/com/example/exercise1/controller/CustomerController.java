package com.example.exercise1.controller;

import com.example.exercise1.model.Customer;
import com.example.exercise1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    ICustomerService iCustomerService;

    @GetMapping("")
    public String list(){


        return "list";
    }

    @GetMapping("create")
    public String create(Model model){
        model.addAttribute("customer",new Customer());
        return "create";
    }

    @PostMapping("doCreate")
    public String doCreate(@Valid @ModelAttribute("customer")Customer customer, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "create";
        }
        return "redirect:/customer";
    }
}
