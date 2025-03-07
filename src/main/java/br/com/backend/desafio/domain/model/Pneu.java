package br.com.backend.desafio.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "pneu")
@Getter
@Setter
public class Pneu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String marca;

	private String modelo;

	private String tamanho;

	private double preco;

	public Pneu() {
	}

	public Pneu(String marca, String modelo, String tamanho, double preco) {
		this.marca = marca;
		this.modelo = modelo;
		this.tamanho = tamanho;
		this.preco = preco;
	}

}
