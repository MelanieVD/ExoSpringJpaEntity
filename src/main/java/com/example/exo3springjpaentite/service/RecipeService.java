package com.example.exo3springjpaentite.service;

import com.example.exo3springjpaentite.model.Ingredient;
import com.example.exo3springjpaentite.model.Recipe;
import com.example.exo3springjpaentite.repository.RecipeRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeService(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    public List<Recipe> findAll(){
        return recipeRepository.findAll();
    }

    public Recipe findById(Long id){
        return recipeRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Recipe not found"));
    }

    public Recipe save(Recipe recipe){
        return recipeRepository.save(recipe);
    }

    public void deleteById(Long id){
        recipeRepository.deleteById(id);
    }

    public void delete(Recipe recipe){
        recipeRepository.delete(recipe);
    }

    public void deleteAll(){
        recipeRepository.deleteAll();
    }

    public Recipe update(Recipe recipe){
        if(recipe.getId() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Recipe id is required");
        }
        return recipeRepository.save(recipe);
    }
}
