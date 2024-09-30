package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    IProductService iProductService;
    @GetMapping("list")
    public String getList(Model model){
        model.addAttribute("productList",iProductService.findAll());
        return "list";
    }

    @GetMapping("create")
    public String create(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }

    @PostMapping("doCreate")
    public String doCreate(@ModelAttribute Product product){
        iProductService.create(product);
        return "redirect:/product/list";
    }

    @GetMapping("/delete/{idProduct}")
    public String delete(@PathVariable int idProduct){
        iProductService.delete(idProduct);
        return "redirect:/product/list";
    }

    @GetMapping("/edit/{idProduct}")
    public String edit(@PathVariable int idProduct,Model model){
        model.addAttribute("product",iProductService.findById(idProduct));
        return "edit";
    }

    @PostMapping("doEdit")
    public String doEdit(@ModelAttribute("product")Product product){
        iProductService.edit(product);
        return "redirect:/product/list";
    }

    @GetMapping("search")
    public String search(Model model, @RequestParam("nameProduct") String nameProduct,@ModelAttribute("product")Product product){
        model.addAttribute("productList",iProductService.findByName(nameProduct));
        return "list";
    }
}
