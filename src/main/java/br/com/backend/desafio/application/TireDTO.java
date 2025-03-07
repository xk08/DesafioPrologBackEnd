package br.com.backend.desafio.application;

import lombok.Getter;
import lombok.Setter;
import br.com.backend.desafio.domain.Tire;

@Getter
@Setter
public class TireDTO {
	private int id;
	private String brand;
	private String model;
	private String size;
	private double price;
	private String imageUrl;

	public TireDTO(Tire tire) {
		this.id = tire.getId();
		this.brand = tire.getBrand();
		this.model = tire.getModel();
		this.size = tire.getSize();
		this.price = tire.getPrice();
		this.imageUrl = tire.getImageUrl();
	}
}