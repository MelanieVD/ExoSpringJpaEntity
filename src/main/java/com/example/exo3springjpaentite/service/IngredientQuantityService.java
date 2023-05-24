package com.example.exo3springjpaentite.service;

import com.example.exo3springjpaentite.model.Ingredient;
import com.example.exo3springjpaentite.model.IngredientQuantity;
import com.example.exo3springjpaentite.repository.IngredientQuantityRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class IngredientQuantityService {
    private final IngredientQuantityRepository ingredientQuantityRepository;

    public IngredientQuantityService(IngredientQuantityRepository ingredientQuantityRepository) {
        this.ingredientQuantityRepository = ingredientQuantityRepository;
    }

    public List<IngredientQuantity> findAll(){
        return ingredientQuantityRepository.findAll();
    }

    public IngredientQuantity findById(Long id){
        return ingredientQuantityRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "IngredientQuantity not found"));
    }

    public IngredientQuantity save(IngredientQuantity ingredientQuantity){
        return ingredientQuantityRepository.save(ingredientQuantity);
    }

    public void deleteById(Long id){
        ingredientQuantityRepository.deleteById(id);
    }

    public void delete(IngredientQuantity ingredientQuantity){
        ingredientQuantityRepository.delete(ingredientQuantity);
    }

    public void deleteAll(){
        ingredientQuantityRepository.deleteAll();
    }

    public IngredientQuantity update(IngredientQuantity ingredientQuantity){
        if(ingredientQuantity.getId() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "IngredientQuantity id is required");
        }
        return ingredientQuantityRepository.save(ingredientQuantity);
    }
}
