package br.com.backend.desafio.infra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.com.backend.desafio.domain.Tire;

@Repository
public interface ITireRepository extends JpaRepository<Tire, Integer> {
}