package com.example.exam1.controller;

import com.example.exam1.model.Sales;
import com.example.exam1.service.ISalesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("sales")
public class SalesController {
    @Autowired
    ISalesService iSalesService;

    @GetMapping("")
    public String home(){
        return "home";
    }

    @GetMapping("listSales")
    public String getListSale(Model model){
        model.addAttribute("listSales",iSalesService.findAll());
        return "list";
    }

    @GetMapping("createSales")
    public String createSales(Model model){
        model.addAttribute("sales",new Sales());
        return "create";
    }

    @PostMapping("doCreateSales")
    public String doCreateSales(@Valid @ModelAttribute("sales")Sales sales, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return "create";
        }
        iSalesService.addNew(sales);
        return "redirect:/sales/listSales";
    }

    @GetMapping("deleteSales")
    public String deleteSales(@RequestParam("deleteId")Integer id){
        iSalesService.deleteById(id);
        return "redirect:/sales/listSales";
    }

    @GetMapping("editSales/{idSales}")
    public String editSales(@PathVariable("idSales")Integer id,Model model){
        model.addAttribute("sales",iSalesService.findById(id));
        return "edit";
    }

    @PostMapping("doEditSales")
    public String doEditSales(@Valid @ModelAttribute("sales")Sales sales,BindingResult bindingResult,Model model){
        if(bindingResult.hasErrors()){
            return "edit";
        }
        return "redirect:/sales/listSales";
    }

    @GetMapping("searchSales")
    public String searchSales(@RequestParam(value = "price",defaultValue = "0")Integer price,@RequestParam("begin")String begin,
                              @RequestParam("end")String end, Model model){
        model.addAttribute("listSales",iSalesService.findByPrice(price,begin,end));
        return "list";
    }
}
