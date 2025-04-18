package com.brwlgg.api.repositories;

import com.brwlgg.api.domain.Jogador.Jogador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogadorRepository extends JpaRepository<Jogador, Long> {
}
