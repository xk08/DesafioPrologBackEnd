package br.com.backend.desafio.infra;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;
import br.com.backend.desafio.application.TireDTO;
import br.com.backend.desafio.application.TireService;

@RestController
@RequestMapping("/api/tires")
public class TireController {

	@Autowired
	private TireService service;

	@GetMapping
	public ResponseEntity<List<TireDTO>> listAllTires() {
		return ResponseEntity.ok(service.listAllTires());
	}

	@GetMapping("/{id}")
	public ResponseEntity<TireDTO> findTireById(@PathVariable Integer id) {
		return ResponseEntity.ok(service.findTireById(id));
	}
}
