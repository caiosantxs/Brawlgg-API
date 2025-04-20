CREATE TABLE partida_possui_modo (
    partida_id BIGINT NOT NULL,
    modo_id BIGINT NOT NULL,
    time_vencedor_id BIGINT,
    pontucao_time1 INTEGER,
    pontucao_time2 INTEGER,

    PRIMARY KEY (partida_id, modo_id),

    CONSTRAINT fk_ppm_partida
        FOREIGN KEY (partida_id)
            REFERENCES partida (id)
            ON DELETE CASCADE,
    CONSTRAINT fk_ppm_modo
        FOREIGN KEY (modo_id)
            REFERENCES modo_de_jogo (id)
            ON DELETE RESTRICT,
    CONSTRAINT fk_ppm_time_vencedor
        FOREIGN KEY (time_vencedor_id)
            REFERENCES time (id)
            ON DELETE SET NULL
)