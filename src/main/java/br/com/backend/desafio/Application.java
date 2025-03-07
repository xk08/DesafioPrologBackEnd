package br.com.backend.desafio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		System.out.println("Server started. Waiting for requests...");
	}

	@GetMapping("/{path}")
	public String handleRequest(@PathVariable String path) {
		System.out.println("Path: " + path);
		return "Path: " + path;
	}

	@GetMapping("/")
	public String defaultRoute() {
		System.out.println("Default path");
		return "Default path";
	}
}
