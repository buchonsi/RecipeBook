package com.yoons.recipebook.repository;

import com.yoons.recipebook.model.RegisteredRecipe;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegisteredRecipeRepository extends JpaRepository<RegisteredRecipe, Long> {
}
