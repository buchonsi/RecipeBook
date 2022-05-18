package com.yoons.recipebook.repository;

import com.yoons.recipebook.model.RegisteredIngredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisteredIngredientRepository extends JpaRepository<RegisteredIngredient,Long> {

}
