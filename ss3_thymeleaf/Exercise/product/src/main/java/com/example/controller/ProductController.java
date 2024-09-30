package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    IProductService iProductService;

    @GetMapping("list")
    public String findAll(Model model){
        List<Product> productList = iProductService.findAll();
        model.addAttribute("productList",productList);
        return "list";
    }

    @GetMapping("create")
    public String showCreate(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }

    @PostMapping("doCreate")
    public String doCreate(@ModelAttribute("product")Product product, RedirectAttributes redirectAttributes){
        iProductService.save(product);
        redirectAttributes.addFlashAttribute("mess","Thêm thành công");
        return "redirect:/product/list";
    }

    @GetMapping("/delete/{idProduct}")
    public String delete(@PathVariable String idProduct){
        iProductService.delete(idProduct);
        return "redirect:/product/list";
    }

    @GetMapping("/edit/{idProduct}")
    public String edit(@PathVariable String idProduct, Model model){
        model.addAttribute("product",iProductService.findById(idProduct));
        return "edit";
    }

    @PostMapping("update")
    public String doEdit(@ModelAttribute Product product){
        iProductService.edit(product.getIdProduct(), product);
        return "redirect:/product/list";
    }

    @PostMapping("search")
    public String doSearch(@RequestParam String name,Model model){
        model.addAttribute("product",iProductService.findByName(name));
        return "search";
    }
}
