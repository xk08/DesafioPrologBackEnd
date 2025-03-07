package br.com.backend.desafio.infra;

import java.util.List;
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
	public ResponseEntity<PneuDTO> buscarPorId(@PathVariable Long id) {
		return service.buscarPorId(id).map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
	}

}
