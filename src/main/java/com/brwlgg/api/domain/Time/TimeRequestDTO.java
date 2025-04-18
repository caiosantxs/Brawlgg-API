package com.brwlgg.api.domain.Time;

import com.brwlgg.api.domain.Evento.EventoResponseDTO;
import com.brwlgg.api.domain.Jogador.Jogador;
import com.brwlgg.api.domain.Jogador.JogadorRequestDTO;
import jakarta.validation.constraints.NotNull;

import java.util.List;
import java.util.Optional;

public record TimeRequestDTO(
        @NotNull String nome,
        @NotNull String regiao,
        Optional<List<@NotNull JogadorRequestDTO>> jogadores,
        List<Long> eventosId
) {
}