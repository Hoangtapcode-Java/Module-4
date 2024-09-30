package com.example.ex1.controller;

import com.example.ex1.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("smartphones")
public class SmartphoneController {
    @Autowired
    ISmartphoneService iSmartphoneService;

    @GetMapping("")
    public String getList(Model model){
        model.addAttribute("listPhone",iSmartphoneService.findAll());
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id")Integer id,Model model){
        model.addAttribute("smartphones",iSmartphoneService.findById(id));
        return "edit";
    }
}
