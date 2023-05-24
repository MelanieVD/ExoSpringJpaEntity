package com.example.exo3springjpaentite.controller;

import com.example.exo3springjpaentite.model.Ingredient;
import com.example.exo3springjpaentite.service.IngredientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredients")
public class IngredientController {

    private final IngredientService ingredientService;

    public IngredientController(IngredientService ingredientService) {
        this.ingredientService = ingredientService;
    }

    @GetMapping("/")
    public List<Ingredient> findAll(){
        return ingredientService.findAll();
    }

    @GetMapping("/{id}")
    public Ingredient findById(@PathVariable Long id){
        return ingredientService.findById(id);
    }

    @PostMapping("/")
    public Ingredient save(@RequestBody Ingredient ingredient){
        return ingredientService.save(ingredient);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id){
        ingredientService.deleteById(id);
    }

    @DeleteMapping("/")
    public void delete(@RequestBody Ingredient ingredient){
        ingredientService.delete(ingredient);
    }

    @DeleteMapping("/all")
    public void deleteAll(){
        ingredientService.deleteAll();
    }

    @PutMapping("/")
    public Ingredient update(@RequestBody Ingredient ingredient){
        return ingredientService.update(ingredient);
    }
}
