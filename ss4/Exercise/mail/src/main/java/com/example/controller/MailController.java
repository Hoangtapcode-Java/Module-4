package com.example.controller;

import com.example.model.Mail;
import com.example.service.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("mail")
public class MailController {
    @Autowired
    IMailService iMailService;
    @GetMapping("")
    public String showMail(Model model){
        model.addAttribute("email",new Mail());
        String[] languages = {"English","Vietnamese", "Japanese","Chinese"};
        Integer[] pageSizes = {5,10,15,50,25,100};
        model.addAttribute("languages",languages);
        model.addAttribute("pageSizes",pageSizes);
        return "list";
    }

    @PostMapping("getmail")
    public String getEmail(@ModelAttribute("mail")Mail mail, Model model, RedirectAttributes redirectAttributes){
        iMailService.update(mail);
        model.addAttribute("email",iMailService.findAll());
        return "redirect:/mail";
    }
}
