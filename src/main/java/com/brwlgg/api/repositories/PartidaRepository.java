package com.brwlgg.api.repositories;

import com.brwlgg.api.domain.Partida.Partida;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidaRepository extends JpaRepository<Partida, Long> {
}
