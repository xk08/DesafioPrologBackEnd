package br.com.backend.desafio.domain;

import br.com.backend.desafio.domain.model.Pneu;

public class PneuDTO {

	private Long id;
	private String marca;
	private String modelo;
	private String tamanho;
	private double preco;

	public PneuDTO(Pneu pneu) {
		this.id = pneu.getId();
		this.marca = pneu.getMarca();
		this.modelo = pneu.getModelo();
		this.tamanho = pneu.getTamanho();
		this.preco = pneu.getPreco();
	}

	public Long getId() {
		return id;
	}

	public String getMarca() {
		return marca;
	}

	public String getModelo() {
		return modelo;
	}

	public String getTamanho() {
		return tamanho;
	}

	public double getPreco() {
		return preco;
	}

}
