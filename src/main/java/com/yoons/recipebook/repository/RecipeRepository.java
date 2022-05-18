package com.yoons.recipebook.repository;

import com.yoons.recipebook.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RecipeRepository extends JpaRepository<Recipe, Long> {
    //@Todo like조건 검색 추가해야함
    //레벨, 타입포함에서 조건처리
    //레시피 제목으로 검색
    public List<Recipe> findByRecipeTitle(String recipeTitle);

}
