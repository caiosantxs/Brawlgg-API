package com.brwlgg.api.domain.Participacao;

public record ParticipacaoResponseDTO(
        Long timeId,
        String nomeTime,
        Integer pontuacao,
        Boolean vencedor
) {

}