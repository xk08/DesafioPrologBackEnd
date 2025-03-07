package br.com.backend.desafio.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;

@Configuration
public class SwaggerConfig {

	@Bean
	public OpenAPI customOpenAPI() {
		return new OpenAPI().info(new Info().title("Desafio Prolog App - API de Pneus").version("1.0")
				.description("Documentação da API para gerenciar pneus")
				.contact(new Contact().name("Marcos Vinnicius Martins").email("cttmarcosmartins@gmail.com")));
	}
}