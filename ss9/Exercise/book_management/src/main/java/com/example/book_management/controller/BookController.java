package com.example.book_management.controller;

import com.example.book_management.aspect.History;
import com.example.book_management.model.Book;
import com.example.book_management.model.Histories;
import com.example.book_management.model.Person;
import com.example.book_management.service.IBookService;
import com.example.book_management.service.IHistoriesService;
import com.example.book_management.service.IPersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    IHistoriesService iHistoriesService;
    @Autowired
    IPersonService iPersonService;
    @Autowired
    IBookService iBookService;

    @GetMapping("")
    public String listBook(Model model){
        model.addAttribute("listBook",iBookService.findAll());
        return "listBook";
    }

    @GetMapping("createBook")
    public String createBook(Model model){
        model.addAttribute("book",new Book());
        model.addAttribute("person",iPersonService.findAll());
        return "createBook";
    }

    @PostMapping("doCreateBook")
    public String doCreateBook(@ModelAttribute("book")Book book){
        iBookService.addNew(book);
        return "redirect:/book";
    }

    @GetMapping("listPerson")
    public String getListPerson(Model model){
        model.addAttribute("listPerson",iPersonService.findAll());
        return "listPerson";
    }

    @GetMapping("createPerson")
    public String createPerson(Model model){
        Integer numberRand = (int) Math.floor(((Math.random() * 89999) + 10000));
        model.addAttribute("numberRand",numberRand);
        model.addAttribute("person",new Person());
        return "createPerson";
    }

    @PostMapping("doCreatePerson")
    public String doCreatePerson(@ModelAttribute("person")Person person){
        Integer code = (int) Math.floor(((Math.random() * 89999) + 10000));
        person.setRandNumber(code);
        iPersonService.save(person);
        return "redirect:/book/listPerson";
    }

    @GetMapping("/borrow/{idBook}")
    public String borrow(@PathVariable("idBook")Integer idBook,Model model) {
        Book book = iBookService.findById(idBook);
        model.addAttribute("bookId",book);
        return "borrow";
    }

    @PostMapping("doBorrow")
    public String doBorrow(@RequestParam("code")Integer code,@RequestParam("id")Integer idBook) throws Exception {
        List<Person> personList = iPersonService.findAll();
        Book book = iBookService.findById(idBook);
        int index = personList.indexOf(new Person(code));
        if(index != -1 && book.getAmount() > 0){
            book.setAmount(book.getAmount()-1);
            iBookService.addNew(book);
        }else {
            throw new Exception();
        }
        return "redirect:/book";
    }

    @GetMapping("pay/{idBook}")
    public String pay(@PathVariable("idBook")Integer idBook,Model model){
        Book book = iBookService.findById(idBook);
        model.addAttribute("bookId",book);
        return "pay";
    }

    @PostMapping("doPay")
    public String doPay(@RequestParam("code")Integer code,@RequestParam("id")Integer idBook) throws Exception {
        List<Person> personList = iPersonService.findAll();
        Book book = iBookService.findById(idBook);
        int index = personList.indexOf(new Person(code));
        if(index != -1){
            book.setAmount(book.getAmount()+1);
            iBookService.addNew(book);
        }else {
            throw new Exception();
        }
        return "redirect:/book";
    }

    @GetMapping("listHistory")
    public String getHistory(Model model){
        model.addAttribute("listHistory",iHistoriesService.findAll());
        return "historyList";
    }


    @ExceptionHandler(Exception.class)
    public String handleException() {
        return "error";
    }
}
