package br.com.backend.desafio.application;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Service;
import br.com.backend.desafio.application.PneuDTO;
import br.com.backend.desafio.infra.IPneuRepository;

@Service
public class PneuService {

	private final IPneuRepository repository;

	public PneuService(IPneuRepository repository) {
		this.repository = repository;
	}

	public List<PneuDTO> listarTodos() {
		return repository.findAll().stream().map(PneuDTO::new).collect(Collectors.toList());
	}

	public Optional<PneuDTO> buscarPorId(Long id) {
		return Optional.ofNullable(repository.findById(id).map(PneuDTO::new).orElseThrow(() -> {
			System.out.println("Item não encontrado");
			return new RuntimeException("Item não encontrado");
		}));
	}
}
