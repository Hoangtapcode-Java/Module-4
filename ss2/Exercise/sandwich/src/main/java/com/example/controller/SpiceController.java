package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("condiments")
public class SpiceController {

    @GetMapping("")
    public String createCondiments(){
        return "create";
    }

    @PostMapping("/List")
    public String listCondiments(@RequestParam String[] condiments, @RequestParam String name, Model model){
        model.addAttribute("condiments",condiments);
        model.addAttribute("name",name);
        return "list";
    }

}
