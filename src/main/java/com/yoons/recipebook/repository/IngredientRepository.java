package com.yoons.recipebook.repository;

import com.yoons.recipebook.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient, Long> {
    //이건 CRUD만 있음 될 거 같고
}
