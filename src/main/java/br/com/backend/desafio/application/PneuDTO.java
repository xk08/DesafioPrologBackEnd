package br.com.backend.desafio.application;

import lombok.Getter;
import lombok.Setter;
import br.com.backend.desafio.domain.Pneu;

@Getter
@Setter
public class PneuDTO {
	private Long id;
	private String marca;
	private String modelo;
	private String tamanho;
	private double preco;
	private String imageUrl;

	public PneuDTO(Pneu pneu) {
		this.id = pneu.getId();
		this.marca = pneu.getMarca();
		this.modelo = pneu.getModelo();
		this.tamanho = pneu.getTamanho();
		this.preco = pneu.getPreco();
		this.imageUrl = pneu.getImageUrl();
	}
}