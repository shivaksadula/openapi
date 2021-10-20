package com.pwc.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import io.swagger.v3.oas.annotations.security.SecuritySchemes;
import org.springdoc.webmvc.ui.SwaggerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title = "Workspace Service", version = "v1"))
@SecuritySchemes({
        @SecurityScheme(
                name = "bearer",
                type = SecuritySchemeType.HTTP,
                bearerFormat = "JWT",
                scheme = "bearer"
        ),
        @SecurityScheme(
                name = "basicAuth",
                type = SecuritySchemeType.HTTP,
                bearerFormat = "JWT",
                scheme = "basic"
        )
})
public class OpenApiConfig {

        /*public Docket getDocket(@Autowired SwaggerConfig config) {
                return new Docket(DocumentationType.SWAGGER_2)
                        .select()
                        .apis(RequestHandlerSelectors.basePackage("com.pwc"))
                        .build()
                        .apiInfo(apiInfo(config))
                        .securitySchemes(getSecurityScheme())
                        .securityContexts(getSecurityContexts());
        }*/
}
