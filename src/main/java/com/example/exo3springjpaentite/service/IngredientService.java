package com.example.exo3springjpaentite.service;

import com.example.exo3springjpaentite.model.Ingredient;
import com.example.exo3springjpaentite.repository.IngredientRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
@Service
public class IngredientService {

    private final IngredientRepository ingredientRepository;

    public IngredientService(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    public List<Ingredient> findAll(){
        return ingredientRepository.findAll();
    }

    public Ingredient findById(Long id){
        return ingredientRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Ingredient not found"));

    }

    public Ingredient save(Ingredient ingredient){
        return ingredientRepository.save(ingredient);
    }

    public void deleteById(Long id){
        ingredientRepository.deleteById(id);
    }

    public void delete(Ingredient ingredient){
        ingredientRepository.delete(ingredient);
    }

    public void deleteAll(){
        ingredientRepository.deleteAll();
    }

    public Ingredient update(Ingredient ingredient){
        if(ingredient.getId() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Ingredient id is required");
        }
        return ingredientRepository.save(ingredient);
    }

}
