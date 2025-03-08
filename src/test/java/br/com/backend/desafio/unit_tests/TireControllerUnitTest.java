package br.com.backend.desafio.unit_tests;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import br.com.backend.desafio.application.TireService;
import br.com.backend.desafio.infra.TireController;

@ExtendWith(MockitoExtension.class)
class TireControllerUnitTest {

	private MockMvc mockMvc;

	@Mock
	private TireService tireService;

	@InjectMocks
	private TireController tireController;

	/***
	 * TESTE 5: Deve dar erro ao tentar acessar uma rota/path desconhecido pela API
	 ***/
	@Test
	void testInvalidRoute_ShouldReturn404() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(tireController).build();
		mockMvc.perform(get("/api/tires/xpto/other")).andExpect(status().isNotFound());
	}
}