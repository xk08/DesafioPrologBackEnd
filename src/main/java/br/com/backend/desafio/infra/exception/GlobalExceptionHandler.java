package br.com.backend.desafio.infra.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import java.time.LocalDateTime;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(TireNotFoundException.class)
	public ResponseEntity<Map<String, Object>> handleTireNotFoundException(TireNotFoundException ex) {
		Map<String, Object> errorResponse = Map.of("timestamp", LocalDateTime.now(), "status",
				HttpStatus.NOT_FOUND.value(), "error", "Not Found", "message", ex.getMessage());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	}

	@ExceptionHandler(ApplicationRouteException.class)
	public ResponseEntity<Map<String, Object>> handleApplicationRouteException(ApplicationRouteException ex) {
		Map<String, Object> errorResponse = Map.of("timestamp", LocalDateTime.now(), "status",
				HttpStatus.NOT_FOUND.value(), "error", "Not Found", "message", ex.getMessage());

		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
	}
}
