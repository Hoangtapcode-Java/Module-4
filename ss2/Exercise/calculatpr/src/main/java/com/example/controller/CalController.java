package com.example.controller;

import com.example.service.ICalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("calculate")
public class CalController {

    @Autowired
    ICalService iCalService;
    @GetMapping("")
    public String calculate(){
        return "calculator";
    }

    @PostMapping("/operate")
    public String getCal(@RequestParam String operate, @RequestParam Float num1, @RequestParam Float num2, Model model){
        float result = 0;
        switch (operate){
            case "Addition(+)":
                result = iCalService.getAddition(num1,num2);
                break;
            case "Subtraction(-)":
                result = iCalService.getSubtraction(num1,num2);
                break;
            case "Multiplication(*)":
                result = iCalService.getMultiplication(num1,num2);
                break;
            case "Division(/)":
                result = iCalService.getDivision(num1,num2);
                break;
        }
        model.addAttribute("result",result);
        return "calculator";
    }
}
