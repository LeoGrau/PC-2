package com.example.pc2ms.tools.configuration;

import io.swagger.v3.oas.models.Components;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration("microserviceConfiguration")
public class MicroserviceConfiguration {
    @Bean
    public OpenAPI openAPI() {
        return (new OpenAPI())
                .components(new Components())
                .info(new Info()
                        .title("PC2! For Fun")
                        .description("Just an exam 💕"));
    }

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
