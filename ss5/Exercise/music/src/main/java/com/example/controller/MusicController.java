package com.example.controller;

import com.example.model.Music;
import com.example.service.IMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("music")
public class MusicController {
    @Autowired
    IMusicService iMusicService;
    @GetMapping("")
    public String listMusic(Model model){
        model.addAttribute("musicList",iMusicService.findAll());
        return "list";
    }

    @GetMapping("create")
    public String create(Model model){
        model.addAttribute("music",new Music());
        return "create";
    }

    @PostMapping("doCreate")
    public String doCreate(@ModelAttribute("music")Music music){
        iMusicService.create(music);
        return "redirect:/music";
    }

    @GetMapping("/delete/{codeSong}")
    public String delete(@PathVariable("codeSong")Integer codeSong){
        iMusicService.delete(codeSong);
        return "redirect:/music";
    }

    @GetMapping("/edit/{codeSong}")
    public String edit(@PathVariable("codeSong")Integer codeSong,Model model){
        model.addAttribute("music",iMusicService.findById(codeSong));
        return "edit";
    }

    @PostMapping("doEdit")
    public String doEdit(@ModelAttribute("music")Music music){
        iMusicService.edit(music);
        return "redirect:/music";
    }

}
