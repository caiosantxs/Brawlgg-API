package com.brwlgg.api.repositories;

import com.brwlgg.api.domain.Participacao.Participacao;
import com.brwlgg.api.domain.Participacao.ParticipacaoPK;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParticipacaoRepository extends JpaRepository<Participacao, ParticipacaoPK> {
}
