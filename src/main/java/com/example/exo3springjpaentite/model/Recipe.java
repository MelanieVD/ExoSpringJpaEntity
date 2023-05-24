package com.example.exo3springjpaentite.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Entity
@Getter
@Setter
public class Recipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @OneToMany
    private List<IngredientQuantity> ingredientQuantities;
    @ManyToMany(mappedBy = "recipe")
    @JsonBackReference
    private List<Category> category;

    public Recipe() {
    }
}
