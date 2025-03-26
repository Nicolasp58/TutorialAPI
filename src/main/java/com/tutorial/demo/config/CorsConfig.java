package com.tutorial.demo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.CorsRegistry;

@Configuration
public class CorsConfig implements WebMvcConfigurer{
    
    @Override
    public void addCorsMappings(CorsRegistry registry){
        registry.addMapping("/*") // Aplica a todos los endpoint
        .allowedOrigins("*") // Dominios permitidos
        .allowedMethods("GET", "POST", "PUT", "DELETE", "OPTIONS") // Métodos permitidos
        .allowedHeaders("Content-Type", "Authorization") // Permite todos los encabezados
        .allowCredentials(true); // Permitir envío de cookies y credenciales
    }
}