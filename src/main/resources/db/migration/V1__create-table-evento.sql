CREATE TABLE evento (
    id BIGSERIAL PRIMARY KEY,
    nome VARCHAR(30) NOT NULL,
    data_inicio DATE NOT NULL,
    data_fim DATE NOT NULL,
    premiacao DECIMAL NOT NULL,
    local VARCHAR NOT NULL,
    status VARCHAR NOT NULL
);


