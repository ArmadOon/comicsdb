package com.armadoon.comicsdb.configuration

import io.swagger.v3.oas.models.OpenAPI
import io.swagger.v3.oas.models.info.Contact
import io.swagger.v3.oas.models.info.Info
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class OpenApiConfig {

    @Bean
    fun openAPI(): OpenAPI {
        return OpenAPI()
            .info(
                Info()
                    .title("Comic Book API")
                    .description("API pro správu komiksů a autorů")
                    .version("1.0")
                    .contact(
                        Contact()
                            .name("Martin Pluhař")
                            .email("pluhar.martin@outlook.com")
                    )
            )
    }
}