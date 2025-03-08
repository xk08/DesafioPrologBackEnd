package br.com.backend.desafio.application;

import br.com.backend.desafio.domain.Tire;

public record TireDTO(Integer id, String brand, String model, String size, Double price, String imageUrl) {
	public TireDTO(Tire tire) {
		this(tire.getId(), tire.getBrand(), tire.getModel(), tire.getSize(), tire.getPrice(), tire.getImageUrl());
	}
}