package com.example.exo3springjpaentite.controller;

import com.example.exo3springjpaentite.model.Category;
import com.example.exo3springjpaentite.model.IngredientQuantity;
import com.example.exo3springjpaentite.service.IngredientQuantityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ingredientQuantities")
public class IngredientQuantityController {
    private final IngredientQuantityService ingredientQuantityService;

    public IngredientQuantityController(IngredientQuantityService ingredientQuantityService) {
        this.ingredientQuantityService = ingredientQuantityService;
    }

    @GetMapping("/")
    public List<IngredientQuantity> findAll(){
        return ingredientQuantityService.findAll();
    }

    @GetMapping("/{id}")
    public IngredientQuantity findById(@PathVariable Long id){
        return ingredientQuantityService.findById(id);
    }

    @PostMapping("")
    public IngredientQuantity save(@RequestBody IngredientQuantity ingredientQuantity){
        return ingredientQuantityService.save(ingredientQuantity);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@RequestBody Long id){
        ingredientQuantityService.deleteById(id);
    }

    @DeleteMapping("")
    public void delete(@RequestBody IngredientQuantity ingredientQuantity){
        ingredientQuantityService.delete(ingredientQuantity);
    }

    @DeleteMapping("/all")
    public void deleteAll(){
        ingredientQuantityService.deleteAll();
    }

    @PutMapping("/")
    public IngredientQuantity update(@RequestBody IngredientQuantity ingredientQuantity){
        return ingredientQuantityService.update(ingredientQuantity);
    }
}
