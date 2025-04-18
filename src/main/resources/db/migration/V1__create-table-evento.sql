CREATE TABLE evento (
    id SERIAL PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    data_inicio DATE NOT NULL,
    data_fim DATE NOT NULL,
    premiacao FLOAT NOT NULL,
    local VARCHAR(100),
    status VARCHAR(20),
    CHECK (data_fim >= data_inicio)
);

