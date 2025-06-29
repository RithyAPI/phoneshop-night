package com.piseth.java.school.phoneshopenight.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI openApi() {
        return new OpenAPI()
                .info(new Info()
                        .title("PhoneShop API")
                        .description("Swagger for Phoneshop APIs")
                        .version("1.0.0"));
    }
}
