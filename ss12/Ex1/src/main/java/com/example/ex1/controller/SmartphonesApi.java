package com.example.ex1.controller;

import com.example.ex1.model.Smartphones;
import com.example.ex1.service.ISmartphoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/smartphones")
public class SmartphonesApi {
    @Autowired
    ISmartphoneService iSmartphoneService;

    @GetMapping("")
    public List<Smartphones> getList(){
        return iSmartphoneService.findAll();
    }

    @PostMapping("create")
    public ResponseEntity<?> create(@RequestBody Smartphones smartphones){
        iSmartphoneService.save(smartphones);
        return new ResponseEntity<>(iSmartphoneService.findAll(),HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id")Integer id){
        iSmartphoneService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("edit")
    public ResponseEntity<?> edit(@RequestBody Smartphones smartphones){
        iSmartphoneService.save(smartphones);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
