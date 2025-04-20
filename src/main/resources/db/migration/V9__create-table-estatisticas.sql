CREATE TABLE estatisticas (
    id BIGSERIAL PRIMARY KEY,       -- @Id, @GeneratedValue(strategy = GenerationType.IDENTITY)
    jogador_id BIGINT NOT NULL,     -- @ManyToOne Jogador, @JoinColumn(nullable = false)
    -- Chaves estrangeiras que formam a referência para PartidaPossuiModo (chave composta)
    partida_id BIGINT NOT NULL,
    modo_id BIGINT NOT NULL,

    brawler VARCHAR,
    kills INTEGER NOT NULL,
    deaths INTEGER NOT NULL,
    dps INTEGER NOT NULL,

    -- Chave estrangeira para Jogador
       CONSTRAINT fk_estatisticas_jogador
          FOREIGN KEY (jogador_id)
            REFERENCES jogador (id)
            ON DELETE CASCADE, -- Se o jogador for deletado, remove suas estatísticas

    -- Chave estrangeira composta para PartidaPossuiModo
        CONSTRAINT fk_estatisticas_ppm
            FOREIGN KEY (partida_id, modo_id) -- Colunas nesta tabela
               REFERENCES partida_possui_modo (partida_id, modo_id) -- Colunas na tabela referenciada
               ON DELETE CASCADE -- Se o segmento for deletado, remove as estatísticas associadas a ele
);
