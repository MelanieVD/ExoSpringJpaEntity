package com.example.exo3springjpaentite.service;

import com.example.exo3springjpaentite.model.Category;
import com.example.exo3springjpaentite.model.Ingredient;
import com.example.exo3springjpaentite.repository.CategoryRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAll(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        return categoryRepository.findById(id).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "Category not found"));
    }

    public Category save(Category category){
        return categoryRepository.save(category);
    }

    public void deleteById(Long id){
        categoryRepository.deleteById(id);
    }

    public void delete(Category category){
        categoryRepository.delete(category);
    }

    public void deleteAll(){
        categoryRepository.deleteAll();
    }

    public Category update(Category category){
        if(category.getId() == null){
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, "Categorie id is required");
        }
        return categoryRepository.save(category);
    }
}
