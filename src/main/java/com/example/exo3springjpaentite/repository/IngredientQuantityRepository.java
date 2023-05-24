package com.example.exo3springjpaentite.repository;

import com.example.exo3springjpaentite.model.IngredientQuantity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IngredientQuantityRepository extends JpaRepository<IngredientQuantity, Long> {
}
