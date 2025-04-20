CREATE TABLE evento_time (
    evento_id BIGINT NOT NULL,
    time_id BIGINT NOT NULL,

        PRIMARY KEY (evento_id, time_id),

            CONSTRAINT fk_evento_time_evento
                FOREIGN KEY (evento_id)
                    REFERENCES evento (id)
                    ON DELETE CASCADE,
            CONSTRAINT fk_evento_time_time
                FOREIGN KEY (time_id)
                    REFERENCES time (id)
                    ON DELETE CASCADE
);