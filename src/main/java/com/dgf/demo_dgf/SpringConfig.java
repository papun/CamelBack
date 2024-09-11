package com.dgf.demo_dgf;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class SpringConfig {
	@Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("DGF API")
                        .version("1.0.0")
                        .description("API for DGF Configuration")
                        .termsOfService("http://swagger.io/terms/")
                        .contact(new Contact().name("API for DGF").url("http://dgf.com").email("dgf@dgf.com"))
                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
    }

    @Bean
    public GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder()
                .group("dgf")
                .pathsToMatch("/dgf/**")
                .build();
    }

}
