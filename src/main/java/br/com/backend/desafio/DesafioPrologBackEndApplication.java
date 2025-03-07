package br.com.backend.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DesafioPrologBackEndApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioPrologBackEndApplication.class, args);
		System.out.println("Servidor iniciado. Aguardando requisições...");
	}

	@GetMapping("/{path}")
	public String handleRequest(@PathVariable String path) {
		System.out.println("Rota acessada: " + path);
		return "Rota acessada: " + path;
	}

	@GetMapping("/")
	public String defaultRoute() {
		System.out.println("Rota acessada: rota padrão");
		return "Rota acessada: rota padrão";
	}

}
