package br.com.backend.desafio.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pneu")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pneu {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String marca;
	private String modelo;
	private String tamanho;
	private double preco;
}