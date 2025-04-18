package com.brwlgg.api.domain.Partida;

import com.brwlgg.api.domain.Participacao.ParticipacaoRequestDTO;
import com.brwlgg.api.domain.PartidaPossuiModo.PartidaPossuiModoRequestDTO;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.util.List;

public record PartidaRequestDTO(
        @NotNull LocalDate data,
        @NotBlank String status,
        List<@NotNull ParticipacaoRequestDTO> participacoes,
        List<@NotNull PartidaPossuiModoRequestDTO> modosDeJogo
        ) {
}
