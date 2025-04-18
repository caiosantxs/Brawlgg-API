package com.brwlgg.api.domain.Jogador;

public record JogadorResponseDTO(
        Long id,
        Long timeId,
        String nome,
        String apelido,
        String nacionalidade
        ) {
    public JogadorResponseDTO(Jogador jogador) {
    this(jogador.getId(),
         jogador.getTime().getId(),
         jogador.getNome(),
         jogador.getApelido(),
         jogador.getNacionalidade());
}
}
