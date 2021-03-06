package com.medikare.controller;

import java.util.List;


import com.medikare.model.Category;
import com.medikare.services.CategoryService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
@CrossOrigin("*")
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/")
    public ResponseEntity<?> addCategory(@RequestBody Category category){
        Category local = this.categoryService.addCategory(category);
        return ResponseEntity.ok(local);
    }

    @GetMapping("/")
    public ResponseEntity<?> getCategories(){
        List<Category> local = this.categoryService.getCategories();
        return ResponseEntity.ok(local);
    }
     @GetMapping("/{id}")
    public Category getCategory(@PathVariable Integer id){
        return this.categoryService.getCategory(id).get();
    }
    @PutMapping("/")
    public ResponseEntity<?> updateCategory(@RequestBody Category category){
      Category local = this.categoryService.updateCategory(category);
      return ResponseEntity.ok(local);
    }    

    @DeleteMapping("/{id}")
    public void deleteCategory(@PathVariable("id") Integer id){
        this.categoryService.deleteCategory(id);
    }
}
