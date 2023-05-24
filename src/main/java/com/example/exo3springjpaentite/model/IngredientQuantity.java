package com.example.exo3springjpaentite.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class IngredientQuantity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "quantity")
    private int quantity;
    @ManyToOne
//    @JoinColumn(name="ingredient")
    private Ingredient ingredient;

    public IngredientQuantity() {
    }
}
