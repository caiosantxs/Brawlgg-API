package com.brwlgg.api.repositories;

import com.brwlgg.api.domain.Evento.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
