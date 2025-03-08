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

	/*** TESTE 5: Deve dar erro ao tentar acessar uma rota desconhecida pela API ***/
	@Test
	void testInvalidRoute_ShouldReturn404() throws Exception {
		/// Realiza uma requisição GET para uma rota inválida e espera que o status da resposta seja 404 (Not Found)
		mockMvc = MockMvcBuilders.standaloneSetup(tireController).build();
		mockMvc.perform(get("/api/tires/xpto/other")).andExpect(status().isNotFound());
	}
}