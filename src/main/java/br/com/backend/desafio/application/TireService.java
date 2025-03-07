package br.com.backend.desafio.application;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import br.com.backend.desafio.application.TireDTO;
import br.com.backend.desafio.infra.ITireRepository;

@Service
public class TireService {

	private final ITireRepository repository;

	public TireService(ITireRepository repository) {
		this.repository = repository;
	}

	public List<TireDTO> listAllTires() {
		return repository.findAll().stream().map(TireDTO::new).collect(Collectors.toList());
	}

	public Optional<TireDTO> findTireById(int id) {
		return Optional.ofNullable(repository.findById(id).map(TireDTO::new).orElseThrow(() -> {
			System.out.println("Item not found");
			return new RuntimeException("Item not found");
		}));
	}
}
