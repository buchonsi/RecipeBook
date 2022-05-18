package com.yoons.recipebook.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter @Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Recipe {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String recipeTitle;

    @Column(length = 4000)
    private String comment;

    @Enumerated(EnumType.STRING)
    private RecipeLevel recipeLevel;

    @ManyToOne
    private RecipeType recipeType;

}
