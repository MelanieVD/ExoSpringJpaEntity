package com.example.exo3springjpaentite.controller;

import com.example.exo3springjpaentite.model.Category;
import com.example.exo3springjpaentite.model.Recipe;
import com.example.exo3springjpaentite.service.RecipeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/recipes")
public class RecipeController {
    private final RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/")
    public List<Recipe> findAll(){
        return recipeService.findAll();
    }

    @GetMapping("/{id}")
    public Recipe findById(@PathVariable Long id){
        return recipeService.findById(id);
    }

    @PostMapping("")
    public Recipe save(@RequestBody Recipe recipe){
        return recipeService.save(recipe);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        recipeService.deleteById(id);
    }

    @DeleteMapping("")
    public void delete(@RequestBody Recipe recipe){
        recipeService.delete(recipe);
    }

    @DeleteMapping("/all")
    public void deleteAll(){
        recipeService.deleteAll();
    }

    @PutMapping("/")
    public Recipe update(@RequestBody Recipe recipe){
        return recipeService.update(recipe);
    }
}
