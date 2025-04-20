CREATE TABLE partida (
        id BIGSERIAL PRIMARY KEY,
        data DATE,
        status VARCHAR,
        time_vencedor_id BIGINT,
        pontuacao_time1 INTEGER,
        pontuacao_time2 INTEGER,

                         CONSTRAINT fk_partida_time_vencedor
                             FOREIGN KEY (time_vencedor_id)
                                 REFERENCES time (id)
                                 ON DELETE SET NULL
);