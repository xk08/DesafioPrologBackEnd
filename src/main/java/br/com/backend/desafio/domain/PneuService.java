package br.com.backend.desafio.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.backend.desafio.domain.model.Pneu;
import br.com.backend.desafio.repository.PneuRepository;

@Service
public class PneuService {

	private final PneuRepository repository;

	public PneuService(PneuRepository repository) {
		this.repository = repository;
	}

	public List<Pneu> listarTodos() {
		return repository.findAll();
	}

	public Optional<Pneu> buscarPorId(Long id) {
		return repository.findById(id);
	}

}
