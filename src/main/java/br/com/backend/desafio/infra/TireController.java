package br.com.backend.desafio.infra;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import br.com.backend.desafio.application.TireDTO;
import br.com.backend.desafio.application.TireService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/tires")
@Tag(name = "Tires", description = "Swagger | Tire management")
public class TireController {

	@Autowired
	private TireService service;

	@GetMapping
	@Operation(summary = "List all tires", description = "Returns a list of all tires available in the database.")
	public ResponseEntity<List<TireDTO>> listAllTires() {
		return ResponseEntity.ok(service.listAllTires());
	}

	@GetMapping("/{id}")
	@Operation(summary = "Find tire by ID", description = "Returns a specific tire by the given ID.")
	public ResponseEntity<TireDTO> findTireById(@PathVariable Integer id) {
		return ResponseEntity.ok(service.findTireById(id));
	}

}
