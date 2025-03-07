package br.com.backend.desafio.controller;

import java.util.List;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import br.com.backend.desafio.domain.PneuService;
import br.com.backend.desafio.domain.model.Pneu;

@RestController
@RequestMapping("/api/pneus")
public class PneuController {

	private final PneuService service;

	public PneuController(PneuService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<Pneu>> listarTodos() {
		return ResponseEntity.ok(service.listarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Pneu> buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

}
