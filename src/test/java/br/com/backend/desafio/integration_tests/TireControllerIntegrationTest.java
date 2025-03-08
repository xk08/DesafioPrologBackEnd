package br.com.backend.desafio.integration_tests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
class TireControllerIntegrationTest {

	@Autowired
	private MockMvc mockMvc;

	/***
	 * TESTE 1: Deve buscar a lista completa de pneus e trazes detalhes do primeiro
	 * registro/pneu
	 ***/
	@Test
	void testListAllTires_ShouldReturn200AndValidResponse() throws Exception {
		// Simulando o GET em /api/tires
		mockMvc.perform(get("/api/tires")).andExpect(status().isOk()).andExpect(jsonPath("$").isArray())
				.andExpect(jsonPath("$[0].id").exists()).andExpect(jsonPath("$[0].brand").exists());
	}

	/***
	 * TESTE 2: Deve buscar o pneu com ID 1 e trazer alguns detalhes do objeto
	 ***/
	@Test
	void testFindTireById_ShouldReturn200AndTireDetails() throws Exception {
		// Supomos que o ID 1 existe no banco de dados
		int tireId = 1;

		mockMvc.perform(get("/api/tires/" + tireId)).andExpect(status().isOk())
				.andExpect(jsonPath("$.id").value(tireId)) // Verifica se o ID na resposta é o esperado
				.andExpect(jsonPath("$.brand").exists()).andExpect(jsonPath("$.model").exists());
	}

	/*** TESTE 3: Deve obter erro 404 ao buscar um pneu com ID inválido ***/
	@Test
	void testFindTireById_ShouldReturn404WhenNotFound() throws Exception {
		// Usando um ID que não existe
		int tireId = 1000;

		mockMvc.perform(get("/api/tires/" + tireId)).andExpect(status().isNotFound())
				.andExpect(jsonPath("$.['API message']").value("Item not found"));
	}
}
