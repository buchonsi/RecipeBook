package com.yoons.recipebook.baisc.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerTestConfig {

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("v1-definition")
                .pathsToMatch("/v1/**")
                .build();
    }
    @Bean
    public OpenAPI springShopOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("RecipeBook API")
                .description("RecipeBook 프로젝트 API")
                .version("v0.0.1"));
    }
}
