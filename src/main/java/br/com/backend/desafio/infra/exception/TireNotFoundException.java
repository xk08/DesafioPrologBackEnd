package br.com.backend.desafio.infra.exception;

public class TireNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public TireNotFoundException(String message) {
		super(message);
	}
}
