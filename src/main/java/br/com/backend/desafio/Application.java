package br.com.backend.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import br.com.backend.desafio.infra.exception.ApplicationRouteException;

@SpringBootApplication
@RestController
@RequestMapping
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Server started. Waiting for requests...");
	}

	@GetMapping("/")
	public String defaultRoute() {
		System.out.println("Default route");
		return "Default route";
	}

	@GetMapping("/**")
	public void handleInvalidRoutes() {
		throw new ApplicationRouteException("Invalid route");
	}

}