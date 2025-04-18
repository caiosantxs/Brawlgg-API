package com.brwlgg.api.domain.Estatisticas;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;


public record EstatisticasRequestDTO(
        @NotNull(message = "O ID do jogador é obrigatório")
        Long jogadorId,

        @NotNull(message = "O ID do brawler utilizado é obrigatório")
        Long brawlerId,

        @NotNull(message = "O ID da relação entre partida e modo de jogo é obrigatório")
        Long modoJogoId,

        @NotNull(message = "O ID da relação entre partida e modo de jogo é obrigatório")
        Long partidaId,

        @Min(value = 0, message = "O número de kills não pode ser negativo")
        int kills,

        @Min(value = 0, message = "O número de deaths não pode ser negativo")
        int deaths,

        @Min(value = 0, message = "O valor de DPS não pode ser negativo")
        int dps
) {
}
