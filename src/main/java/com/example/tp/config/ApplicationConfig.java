package com.example.tp.config;

import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

public class ApplicationConfig extends ResourceConfig {
    public ApplicationConfig() {
        packages("com.example.tp.resources",
                 "com.example.tp.filters",
                 "com.example.tp.interceptors",
                 "com.example.tp.errors");
        register(JacksonFeature.class);
        register(OpenApiResource.class);
        property("jersey.config.beanValidation.enableOutputValidationErrorEntity.server", true);
    }
}
