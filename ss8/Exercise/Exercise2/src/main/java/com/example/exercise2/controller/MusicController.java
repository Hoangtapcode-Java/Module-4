package com.example.exercise2.controller;

import com.example.exercise2.model.Music;
import com.example.exercise2.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("music")
public class MusicController {
    @Autowired
    IMusicService iMusicService;

    @GetMapping("")
    public String list(Model model){
        model.addAttribute("listMusic",iMusicService.findAll());
        return "list";
    }

    @GetMapping("create")
    public String create(Model model){
        model.addAttribute("music",new Music());
        return "create";
    }

    @PostMapping("doCreate")
    public String doCreate(@Valid @ModelAttribute("music")Music music, BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "create";
        }
        iMusicService.save(music);
        return "redirect:/music";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id")Integer id,Model model){
        model.addAttribute("music",iMusicService.findById(id));
        return "edit";
    }

    @PostMapping("doEdit")
    public String doEdit(@Valid @ModelAttribute("music")Music music,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "edit";
        }
        iMusicService.save(music);
        return "redirect:/music";
    }
}
