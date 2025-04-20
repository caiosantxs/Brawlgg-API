CREATE TABLE participacao (
    partida_id BIGINT NOT NULL,
    time_id BIGINT NOT NULL,

    PRIMARY KEY (partida_id, time_id),

    CONSTRAINT fk_participacao_partida
        FOREIGN KEY (partida_id)
        REFERENCES partida (id)
        ON DELETE CASCADE,

    CONSTRAINT fk_participacao_time
        FOREIGN KEY (time_id)
        REFERENCES time (id)
        ON DELETE CASCADE
)