package com.example.controller;

import com.example.dto.UserDto;
import com.example.model.Login;
import com.example.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("login")
public class LoginController {
    @Autowired
    IUserService iUserService;

    @GetMapping("")
    public String showLogin(Model model){
        model.addAttribute("login",new Login());
        return "login";
    }
    @PostMapping("/show")
    public String login(@ModelAttribute("login")Login login, Model model){
        UserDto userDto = iUserService.checkLogin(login);
        if(userDto == null){
//            model.addAttribute("Error","Login Error");
            return "error";
        }else {
            model.addAttribute("user", userDto);
            return "show";
        }
    }
}
