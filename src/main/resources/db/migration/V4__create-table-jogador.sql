CREATE TABLE jogador (
    id BIGSERIAL PRIMARY KEY,
    time_id BIGINT,
    nome VARCHAR NOT NULL,
    apelido VARCHAR NOT NULL,
    nacionalidade VARCHAR NOT NULL,

                         CONSTRAINT fk_jogador_time
                             FOREIGN KEY (time_id)
                                 REFERENCES time (id)
                                 ON DELETE SET NULL
);
