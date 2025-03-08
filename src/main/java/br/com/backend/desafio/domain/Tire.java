package br.com.backend.desafio.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tire")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tire {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String brand;
	private String model;
	private String size;
	private Double price;
	private String imageUrl;
}