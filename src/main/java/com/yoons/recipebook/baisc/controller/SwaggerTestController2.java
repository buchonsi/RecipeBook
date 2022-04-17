package com.yoons.recipebook.baisc.controller;

import com.yoons.recipebook.baisc.dto.SwaggerTestDto;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@Tag(name = "SwaggerTest2", description = "Swagger 테스트2")
@RestController
@RequestMapping("/v1/test2")
@RequiredArgsConstructor
public class SwaggerTestController2 {

    @Operation(summary = "get swaggerTest2", description = "테스트 응답받기2")
    @ApiResponses({
            @ApiResponse(responseCode = "200", description = "OK", content = @Content(schema = @Schema(implementation = SwaggerTestDto.class))),
            @ApiResponse(responseCode = "400", description = "BAD REQUEST", content = @Content(schema = @Schema(hidden = true))),
            @ApiResponse(responseCode = "404", description = "NOT FOUND", content = @Content(schema = @Schema(hidden = true))),
            @ApiResponse(responseCode = "500", description = "INTERNAL SERVER ERROR", content = @Content(schema = @Schema(hidden = true)))
    })
    @Parameters({
            @Parameter(name = "name", description = "레시피명", example = "가지볶음"),
            @Parameter(name = "price", description = "가격", example = "2000")
    })
    @ResponseBody
    @GetMapping()
    public SwaggerTestDto getSwagger2(
            @RequestParam(value = "name") String name,
            @RequestParam(value = "price", required = false) int price
    ) {
        return new SwaggerTestDto(name,price);
    }

    @PostMapping("/{name}")
    public String postSwagger2(@PathVariable String name) {
        return "Ok";
    }

    @GetMapping("/test")
    public SwaggerTestDto getSwagger3(@ModelAttribute SwaggerTestDto swaggerTestDto){
        String name = swaggerTestDto.getName();
        int price = swaggerTestDto.getPrice();
        return new SwaggerTestDto(name, price);
    }
}