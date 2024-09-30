package com.example.product.controller;

import com.example.product.model.Product;
import com.example.product.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
@RequestMapping("product")
public class ProductController {
    @Autowired
    IProductService iProductService;
    @GetMapping("")
    public String getList(@RequestParam(value = "page",defaultValue = "0")int page, Model model){
        Sort sort = Sort.by("priceProduct");
        model.addAttribute("listProduct",iProductService.findAll(PageRequest.of(page,3,sort)));
        return "list";
    }

    @GetMapping("create")
    public String create(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }

    @PostMapping("doCreate")
    public String doCreate(@ModelAttribute("product")Product product){
        iProductService.save(product);
        return "redirect:/product";
    }

    @GetMapping("/delete/{idProduct}")
    public String delete(@PathVariable("idProduct")Integer id){
        iProductService.delete(id);
        return "redirect:/product";
    }
    @GetMapping("/edit/{idProduct}")
    public String edit(@PathVariable("idProduct")Integer id, Model model){
        model.addAttribute("product",iProductService.findById(id));
        return "edit";
    }

    @PostMapping("doEdit")
    public String doEdit(@ModelAttribute("product")Product product,Model model){
        iProductService.save(product);
        return "redirect:/product";
    }

}
