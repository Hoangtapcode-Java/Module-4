package com.example.furama.controller;

import com.example.furama.model.Customer;
import com.example.furama.service.ICustomerService;
import com.example.furama.service.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("furama")
public class FuramaController {

    @Autowired
    ICustomerService iCustomerService;

    @Autowired
    ICustomerTypeService iCustomerTypeService;

    @GetMapping("")
    public String getHome() {
        return "home";
    }

    @GetMapping("createCustomer")
    public String createCustomer(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerType",iCustomerTypeService.findAll());
        return "createCustomer";
    }

    @PostMapping("doCreateCustomer")
    public String doCreateCustomer(@Valid @ModelAttribute("customer")Customer customer, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("customerType",iCustomerTypeService.findAll());
            return "createCustomer";
        }
        iCustomerService.save(customer);
        return "redirect:/furama/listCustomer";
    }

    @GetMapping("listCustomer")
    public String getListCustomer(@RequestParam(value = "page",defaultValue = "0")int page,Model model,
                                  @RequestParam(value = "name", defaultValue = "")String name,
                                  @RequestParam(value = "idCustomer",defaultValue = "0")Integer id){
        model.addAttribute("searchByName",name);
        model.addAttribute("idCustomer",id);
        model.addAttribute("customerType",iCustomerTypeService.findAll());
        if (name.equals("") && id.equals(0)){
            model.addAttribute("listCustomer",iCustomerService.findAll(name,PageRequest.of(page, 1)));
//            model.addAttribute("listCustomer",iCustomerService.find(PageRequest.of(page,1)));
        }else {
            model.addAttribute("listCustomer", iCustomerService.findAllByName(name, PageRequest.of(page, 1), id));
        }
//            model.addAttribute("listCustomer", iCustomerService.findAllByName(name, PageRequest.of(page, 1), id));
        return "customer";
    }

    @GetMapping("deleteCustomer")
    public String deleteCustomer(@RequestParam("deleteId")Integer id){
        iCustomerService.deleteById(id);
        return "redirect:/furama/listCustomer";
    }

    @GetMapping("/editCustomer/{id}")
    public String editCustomer(@PathVariable("id")Integer id,Model model){
        model.addAttribute("customer",iCustomerService.findById(id));
        model.addAttribute("customerType",iCustomerTypeService.findAll());
        return "editCustomer";
    }

    @PostMapping("doEditCustomer")
    public String doEditCustomer(@Valid @ModelAttribute("customer")Customer customer,BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            model.addAttribute("customerType",iCustomerTypeService.findAll());
            return "editCustomer";
        }
        iCustomerService.save(customer);
        return "redirect:/furama/listCustomer";
    }
}
