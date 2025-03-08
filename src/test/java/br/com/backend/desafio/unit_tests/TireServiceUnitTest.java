package br.com.backend.desafio.unit_tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import br.com.backend.desafio.application.TireDTO;
import br.com.backend.desafio.application.TireService;
import br.com.backend.desafio.domain.Tire;
import br.com.backend.desafio.infra.ITireRepository;

@ExtendWith(MockitoExtension.class)
class TireServiceUnitTest {

	@Mock
	private ITireRepository repository;

	@InjectMocks
	private TireService service;

	private Tire tire1, tire2;

	@BeforeEach
	void setUp() {
		// Criando objetos para os testes
		tire1 = new Tire(1, "Michelin", "X-123", "205/55 R16", 500.0, "http://image.com/1");
		tire2 = new Tire(2, "Pirelli", "PZero", "225/50 R17", 600.0, "http://image.com/2");
	}

	/*** TESTE 1: Deve retornar todos os pneus da lista ***/
	@Test
	void testListAllTires() {
		when(repository.findAll()).thenReturn(Arrays.asList(tire1, tire2));

		List<TireDTO> result = service.listAllTires();

		assertEquals(2, result.size()); // Verifica se retornou 2 pneus
		assertEquals("Michelin", result.get(0).getBrand()); // Verifica se o primeiro é Michelin
		assertEquals("Pirelli", result.get(1).getBrand()); // Verifica se o segundo é Pirelli

		verify(repository, times(1)).findAll(); // Garante que findAll() foi chamado uma vez
	}

	/*** TESTE 2: Deve retornar um pneu pelo ID ***/
	@Test
	void testFindTireById_ExistingId() {
		when(repository.findById(1)).thenReturn(Optional.of(tire1));
		Optional<TireDTO> result = service.findTireById(1);

		assertTrue(result.isPresent()); // O objeto deve estar presente
		assertEquals("Michelin", result.get().getBrand()); // Deve ser o Michelin
		verify(repository, times(1)).findById(1); // Garante que findById() foi chamado uma vez
	}

	/*** TESTE 3: Deve lançar exceção ao buscar um pneu inexistente (com base no ID) ***/
	@Test
	void testFindTireById_NonExistingId() {
		when(repository.findById(1000)).thenReturn(Optional.empty());
		RuntimeException exception = assertThrows(RuntimeException.class, () -> {
			service.findTireById(1000);
		});

		assertEquals("Item not found", exception.getMessage()); // Verifica a mensagem de erro
		verify(repository, times(1)).findById(1000); // Garante que findById() foi chamado
	}

	/*** TESTE 4: Deve retornar lista vazia (se não houver pneus) ***/
	@Test
	void testListAllTires_EmptyList() {
		when(repository.findAll()).thenReturn(Arrays.asList());
		List<TireDTO> result = service.listAllTires();

		assertEquals(0, result.size()); // Verifica se retornou uma lista vazia
		verify(repository, times(1)).findAll(); // Garante que findAll() foi chamado
	}
}