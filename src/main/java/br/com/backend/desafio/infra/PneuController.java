package br.com.backend.desafio.infra;

import java.util.List;
import java.util.Optional;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import br.com.backend.desafio.application.PneuDTO;
import br.com.backend.desafio.application.PneuService;

@RestController
@RequestMapping("/api/pneus")
public class PneuController {

	private final PneuService service;

	public PneuController(PneuService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<PneuDTO>> listarTodos() {
		return ResponseEntity.ok(service.listarTodos());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> buscarPorId(@PathVariable Long id) {
		try {
			Optional<PneuDTO> pneu = service.buscarPorId(id);
			return ResponseEntity.ok(pneu);
		} catch (RuntimeException e) {
			return ResponseEntity.status(404).body(String.format("{\"API message\": \"%s\"}", e.getMessage()));
		}
	}
}
