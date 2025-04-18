package com.brwlgg.api.domain.ModoJogo;

import jakarta.validation.constraints.NotBlank;
import jdk.jfr.Description;

public record ModoJogoRequestDTO(
   @NotBlank
   @Description("nome do modo de jogo")
   String nome,
   @NotBlank
   @Description("Descrição do modo de jogo, como ele funciona.")
   String descricao
) {
}
