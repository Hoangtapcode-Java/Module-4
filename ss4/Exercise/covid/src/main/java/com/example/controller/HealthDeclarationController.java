package com.example.controller;

import com.example.model.HealthDeclaration;
import com.example.service.IHealthDeclarationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("medican")
public class HealthDeclarationController {
    @Autowired
    IHealthDeclarationService iHealthDeclarationService;
//    @GetMapping("showList")
//    public String showList(Model model){
//        return "list";
//    }
    @GetMapping("showCreate")
    public String showHealthDeclaration(Model model){
        model.addAttribute("medican", new HealthDeclaration());
        int[] yearOfBirth = {1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000};
        String[] gender = {"men","women"};
        String[] transport = {"Tàu bay", "Tàu thuyền","Ô tô", "Khác ( ghi rõ )"};
        int[] date = {01,02,03,04,05,06,07};
        int[] month = {10,11,12};
        model.addAttribute("yearOfBirth",yearOfBirth);
        model.addAttribute("gender",gender);
        model.addAttribute("transport",transport);
        return "create";
    }

    @PostMapping("create")
    public String create(@ModelAttribute("medican") HealthDeclaration medican, Model model, RedirectAttributes redirectAttributes){
        iHealthDeclarationService.save(medican);
        model.addAttribute("medican",medican);
        return "list";
    }
}
