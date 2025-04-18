package com.brwlgg.api.domain.PartidaPossuiModo;

import com.brwlgg.api.domain.Estatisticas.EstatisticasRequestDTO;
import jakarta.validation.constraints.NotNull;

import java.util.List;

public record PartidaPossuiModoRequestDTO(
        @NotNull Long idModo,
        @NotNull Long idPartida,
        @NotNull List<EstatisticasRequestDTO> estatisticas,
        @NotNull Long idTimeVencedor,
        @NotNull Integer pontuacaoTime1,
        @NotNull Integer pontuacaoTime2
) {
}
