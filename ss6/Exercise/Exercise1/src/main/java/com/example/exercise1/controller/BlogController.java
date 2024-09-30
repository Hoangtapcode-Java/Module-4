package com.example.exercise1.controller;

import com.example.exercise1.model.Blog;
import com.example.exercise1.model.Category;
import com.example.exercise1.service.IAuthorService;
import com.example.exercise1.service.IBlogService;
import com.example.exercise1.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    IBlogService iBlogService;
    @Autowired
    IAuthorService iAuthorService;
    @Autowired
    ICategoryService iCategoryService;

    @GetMapping("")
    public String getList(@RequestParam(value = "page",defaultValue = "0")int page, Model model){
        Sort sort = Sort.by("date");
        model.addAttribute("blogList",iBlogService.findAllWithPage(PageRequest.of(page, Integer.parseInt("3"),sort)));
        return "list";
    }

    @GetMapping("blog_ajax")
    public String getBlogAjax(Model model){
//        model.addAttribute("blogList",iBlogService.findAll());
        model.addAttribute("blogList",iBlogService.findAllWithPage(PageRequest.ofSize(3)));
        return "listBlog_ajax";
    }

    @GetMapping("createBlog")
    public String createBlog(Model model){
        model.addAttribute("blog",new Blog());
        model.addAttribute("author",iAuthorService.findAll());
        model.addAttribute("category",iCategoryService.findAll());
        return "createBlog";
    }

    @PostMapping("doCreateBlog")
    public String doCreateBlog(@ModelAttribute("blog")Blog blog){
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("/detail/{id}")
    public String getDetail(@PathVariable("id")Integer id,Model model){
        model.addAttribute("blog",iBlogService.findById(id));
        return "detail";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id")Integer id){
        iBlogService.deleteById(id);
        return "redirect:/blog";
    }

    @GetMapping("search")
    public String search(@RequestParam("name")String name,@RequestParam(value = "page",defaultValue = "0")int page,Model model){
//        Page<Blog> page = (Page<Blog>) model.addAttribute("blogList",iBlogService.search(name));
        Sort sort = Sort.by("date");
        model.addAttribute("blogList",iBlogService.searchPage(PageRequest.of(page,3,sort),name));
        return "list";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id")Integer id,Model model){
        model.addAttribute("blog",iBlogService.findById(id));
        model.addAttribute("author",iAuthorService.findAll());
        model.addAttribute("category",iCategoryService.findAll());
        return "edit";
    }

    @PostMapping("doEdit")
    public String doEdit(@ModelAttribute("blog")Blog blog){
        iBlogService.save(blog);
        return "redirect:/blog";
    }

    @GetMapping("categoryList")
    public String categoryList(Model model){
        model.addAttribute("categoryList",iCategoryService.findAll());
        return "categoryList";
    }

    @GetMapping("/deleteCategory/{idCategory}")
    public String deleteCategory(@PathVariable("idCategory")Integer idCategory){
        iBlogService.deleteByIdCategory(idCategory);
        iCategoryService.deleteById(idCategory);
        return "redirect:/blog/categoryList";
    }

    @GetMapping("/detailCategory/{idCategory}")
    public String detailCategory(@PathVariable("idCategory")Integer idCategory, Model model){
        model.addAttribute("listBlog",iBlogService.findByIdCategory(idCategory));
        return "detailCategory";
    }

    @GetMapping("createCategory")
    public String createCategory(Model model){
        model.addAttribute("category",new Category());
        return "createCategory";
    }

    @PostMapping("doCreateCategory")
    public String doCreateCategory(@ModelAttribute("category")Category category){
        iCategoryService.save(category);
        return "redirect:/blog/categoryList";
    }
    @GetMapping("/editCategory/{idCategory}")
    public String editCategory(@PathVariable("idCategory")Integer idCategory,Model model){
        model.addAttribute("category",iCategoryService.findById(idCategory));
        return "editCategory";
    }

    @PostMapping("editCategory")
    public String getEditCategory(@ModelAttribute("category")Category category){
        iCategoryService.save(category);
        return "redirect:/blog/categoryList";
    }
}
