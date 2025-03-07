package br.com.backend.desafio.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tire")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Tire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String brand;
	private String model;
	private String size;
	private double price;
	private String imageUrl;
}