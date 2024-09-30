package com.example.exercise1.controller;

import com.example.exercise1.model.Blog;
import com.example.exercise1.model.Category;
import com.example.exercise1.service.IAuthorService;
import com.example.exercise1.service.IBlogService;
import com.example.exercise1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/blog")
public class BlogApiController {

    @Autowired
    IBlogService iBlogService;

    @Autowired
    IAuthorService iAuthorService;

    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public List<Category> findAll(){
        return iCategoryService.findAll();
    }

    @GetMapping("findAll")
    public List<Blog> findAllBlog(){
        return iBlogService.findAll();
    }

    @GetMapping("/detailBlog/{id}")
    public ResponseEntity<String> detailBlog(@PathVariable("id")Integer id){
        Blog blog = iBlogService.findById(id);
        return new ResponseEntity<>(blog.getDescriptions(), HttpStatus.OK);
    }

    @GetMapping("/detailCategory/{idCategory}")
    public ResponseEntity<List<Blog>> detailCategory(@PathVariable("idCategory")Integer id){
        List<Blog> blog =iBlogService.findByIdCategory(id);
        return new ResponseEntity<>(blog,HttpStatus.OK);
    }

    @PostMapping("create")
    public ResponseEntity<?> createCategory(@RequestBody Category category){
        iCategoryService.save(category);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/deleteCategory/{idCategory}")
    public ResponseEntity<?> deleteCategory(@PathVariable("idCategory")Integer id){
        iCategoryService.deleteById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/search/{name}")
    public List<Blog> searchBlog(@PathVariable("name")String name){
        return iBlogService.searchWithAjax(name);
    }
}
