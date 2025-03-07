package br.com.backend.desafio.infra;

import java.util.List;
import java.util.Optional;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import br.com.backend.desafio.application.TireDTO;
import br.com.backend.desafio.application.TireService;

@RestController
@RequestMapping("/api/tires")
public class TireController {

	private final TireService service;

	public TireController(TireService service) {
		this.service = service;
	}

	@GetMapping
	public ResponseEntity<List<TireDTO>> listAllTires() {
		return ResponseEntity.ok(service.listAllTires());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Object> findTireById(@PathVariable int id) {
		try {
			Optional<TireDTO> tire = service.findTireById(id);
			return ResponseEntity.ok(tire);
		} catch (RuntimeException e) {
			return ResponseEntity.status(404).body(String.format("{\"API message\": \"%s\"}", e.getMessage()));
		}
	}
}
