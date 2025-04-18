package com.brwlgg.api.domain.PartidaPossuiModo;

import com.brwlgg.api.domain.Estatisticas.EstatisticasResponseDTO;

import java.util.List;

public record PartidaPossuiModoResponseDTO(
        Long idModo,
        Long idPartida,
        Long idTimeVencedor,
        List<EstatisticasResponseDTO> estatisticas,
        Integer pontuacaoTime1,
        Integer pontuacaoTime2
) {
}