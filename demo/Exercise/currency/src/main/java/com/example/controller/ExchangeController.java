package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ExchangeController {

    @GetMapping("/exchange")
    public String getChange( Model model){
        return "/USD";
    }

    @PostMapping("/currency")
    public String covertCurency(@RequestParam float usd, Model model ){
        float change = usd * 23000;
        model.addAttribute("change", change);
        return "/USD";
    }
}
