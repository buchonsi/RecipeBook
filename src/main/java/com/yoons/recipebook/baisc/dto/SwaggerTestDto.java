package com.yoons.recipebook.baisc.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class SwaggerTestDto {
    private String name;
    private int price;

    public SwaggerTestDto() {
    }

    public SwaggerTestDto(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
