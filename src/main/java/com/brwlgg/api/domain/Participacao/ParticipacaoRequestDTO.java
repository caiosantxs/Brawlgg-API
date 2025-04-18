package com.brwlgg.api.domain.Participacao;


import jakarta.validation.constraints.NotNull;


public record ParticipacaoRequestDTO(

        @NotNull Long id_time,
        @NotNull Long id_partida,
        @NotNull boolean vencedor
) {
}
