package com.brwlgg.api.domain.Jogador;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record JogadorRequestDTO(
    @NotNull Long timeId,
    @NotBlank String nome,
    @NotBlank String apelido,
    @NotBlank String nacionalidade
) {
}
