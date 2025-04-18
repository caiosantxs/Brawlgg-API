package com.brwlgg.api.repositories;

import com.brwlgg.api.domain.Estatisticas.Estatisticas;
import com.brwlgg.api.domain.PartidaPossuiModo.PartidaPossuiModoPK;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EstatisticasRepository extends JpaRepository<Estatisticas, Long> {
    List<Estatisticas> findByJogadorIdAndPartidaPossuiModoId(Long jogadorId, PartidaPossuiModoPK partidaModoId);
}
