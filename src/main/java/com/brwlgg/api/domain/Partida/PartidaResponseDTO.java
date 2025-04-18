package com.brwlgg.api.domain.Partida;


import com.brwlgg.api.domain.Participacao.ParticipacaoResponseDTO;
import com.brwlgg.api.domain.PartidaPossuiModo.PartidaPossuiModoResponseDTO;

import java.time.LocalDateTime;
import java.util.List;
import java.util.stream.Collectors;

public record PartidaResponseDTO(Long id, LocalDateTime data, String status, List<ParticipacaoResponseDTO> participacoes, List<PartidaPossuiModoResponseDTO> modosDeJogo) {

}

