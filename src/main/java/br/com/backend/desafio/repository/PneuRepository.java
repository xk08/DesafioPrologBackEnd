package br.com.backend.desafio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.backend.desafio.domain.model.Pneu;

public interface PneuRepository extends JpaRepository<Pneu, Long> {}