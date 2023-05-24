package com.example.exo3springjpaentite.controller;

import com.example.exo3springjpaentite.model.Category;
import com.example.exo3springjpaentite.model.Ingredient;
import com.example.exo3springjpaentite.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {

    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/")
    public List<Category> findAll(){
        return categoryService.findAll();
    }

    @GetMapping("/{id}")
    public Category findById(@PathVariable Long id){
        return categoryService.findById(id);
    }

    @PostMapping("")
    public Category save(@RequestBody Category category){
        return categoryService.save(category);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        categoryService.deleteById(id);
    }

    @DeleteMapping("")
    public void delete(@RequestBody Category category){
        categoryService.delete(category);
    }

    @DeleteMapping("/all")
    public void deleteAll(){
        categoryService.deleteAll();
    }

    @PutMapping("/")
    public Category update(@RequestBody Category category){
        return categoryService.update(category);
    }

}
