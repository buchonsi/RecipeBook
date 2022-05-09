package com.yoons.recipebook.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
@Getter @Setter
@Builder
public class Recipe {

    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

//    @TODO enum 타입 만들기...

}
