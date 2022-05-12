package com.yoons.recipebook.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter @Setter
@Builder
public class RecipeType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(nullable = false)
    private String typeName;

    @Column(nullable = false)
    private int typeSeq;

    public RecipeType() {
    }

    public RecipeType(Long id, String typeName, int typeSeq) {
        this.id = id;
        this.typeName = typeName;
        this.typeSeq = typeSeq;
    }

}
