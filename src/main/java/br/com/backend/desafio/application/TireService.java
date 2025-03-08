package br.com.backend.desafio.application;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.com.backend.desafio.infra.ITireRepository;
import br.com.backend.desafio.infra.exception.TireNotFoundException;

@Service
public class TireService {

	@Autowired
	private ITireRepository repository;

	public List<TireDTO> listAllTires() {
		return repository.findAll().stream().map(TireDTO::new).collect(Collectors.toList());
	}

	public TireDTO findTireById(Integer id) {
		return repository.findById(id).map(TireDTO::new).orElseThrow(() -> new TireNotFoundException("Tire not found by ID"));
	}
}
