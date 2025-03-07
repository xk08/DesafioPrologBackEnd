package br.com.backend.desafio.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.backend.desafio.domain.Pneu;

@Repository
public interface IPneuRepository extends JpaRepository<Pneu, Long> {
}