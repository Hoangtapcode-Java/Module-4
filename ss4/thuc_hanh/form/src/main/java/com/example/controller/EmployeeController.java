package com.example.controller;

import com.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("employee")
public class EmployeeController {
    @GetMapping("")
    public String createEmployee(Model model){
        model.addAttribute("employee", new Employee());
        return "create";
    }

    @PostMapping("/infor")
    public String getInfor(@ModelAttribute("employee") Employee employee, Model model){
        model.addAttribute("employee",employee);
        return "infor";
    }
}
