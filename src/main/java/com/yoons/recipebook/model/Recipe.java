package com.yoons.recipebook.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Builder
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToOne
    private RecipeType recipeType;

    @Enumerated(EnumType.STRING)
    private RecipeLevel recipeLevel;

    public Recipe() {
    }

    public Recipe(Long id, RecipeType recipeType, RecipeLevel recipeLevel) {
        this.id = id;
        this.recipeType = recipeType;
        this.recipeLevel = recipeLevel;
    }
}
