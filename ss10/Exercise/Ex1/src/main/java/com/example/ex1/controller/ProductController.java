package com.example.ex1.controller;

import com.example.ex1.model.Cart;
import com.example.ex1.model.Product;
import com.example.ex1.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;

@Controller
@RequestMapping("product")
@SessionAttributes("cart")
public class ProductController {
    @Autowired
    IProductService iProductService;

    @ModelAttribute("cart")
    public Cart sessionCart(){
        return new Cart();
    }

    @GetMapping("")
    public String getListProduct(Model model){
        model.addAttribute("productList",iProductService.findAll());
        return "listProduct";
    }

    @GetMapping("createProduct")
    public String createProduct(Model model){
        model.addAttribute("product",new Product());
        return "createProduct";
    }

    @PostMapping("doCreateProduct")
    public String doCreateProduct(@ModelAttribute("product")Product product){
        iProductService.addProduct(product);
        return "redirect:/product";
    }

    @GetMapping("/addToCart/{idProduct}")
    public String addCart(@PathVariable("idProduct")Integer idProduct,@SessionAttribute Cart cart){
        Product product = iProductService.findById(idProduct);
        cart.addProduct(product);
        return "redirect:/product/cartProduct";
    }
    @GetMapping("/deleteFromCart/{idProduct}")
    public String deleteFromCart(@PathVariable("idProduct")Integer idProduct, @SessionAttribute Cart cart){
        cart.deleteCart(idProduct);
        return "redirect:/product/cartProduct";
    }

    @GetMapping("/cartProduct/deleteCartId/{idProduct}")
    public String deleteCartId(@PathVariable("idProduct")Integer idProduct,@SessionAttribute Cart cart){
        Product product = iProductService.findById(idProduct);
        cart.deleteCartId(product);
        return "redirect:/product/cartProduct";
    }

    @GetMapping("cartProduct")
    public String getListCart(@SessionAttribute Cart cart,Model model){
        model.addAttribute("cart",cart);
        return "listCart";
    }


}
