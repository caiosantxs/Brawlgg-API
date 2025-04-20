package com.brwlgg.api.domain.Estatisticas;

public record EstatisticasResponseDTO(
        Long id,
        Long jogadorId,
        String jogadorNome,
        String brawlerNome,
        Long partidaId,
        String modoJogoNome,
        int kills,
        int deaths,
        int dps
) {
    public EstatisticasResponseDTO(Estatisticas estatisticas) {
        this(
            estatisticas.getId(),
            estatisticas.getJogador().getId(),
            estatisticas.getJogador().getNome(),
            estatisticas.getBrawler(),
            estatisticas.getPartidaPossuiModo().getPartida().getId(),
            estatisticas.getPartidaPossuiModo().getModoDeJogo().getNome(),
            estatisticas.getKills(),
            estatisticas.getDeaths(),
            estatisticas.getDps()
        );
    }
}
