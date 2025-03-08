package br.com.backend.desafio.infra.exception;

public class ApplicationRouteException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ApplicationRouteException(String message) {
		super(message);
	}
}
