package com.brwlgg.api.domain.Participacao;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class ParticipacaoPK implements Serializable {

    @Column(name = "partida_id")
    private Long partidaId;
    @Column(name = "time_id")
    private Long timeId;

    public ParticipacaoPK() {}

    public ParticipacaoPK(Long partidaId, Long timeId) {
        this.partidaId = partidaId;
        this.timeId = timeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ParticipacaoPK that = (ParticipacaoPK) o;
        return Objects.equals(partidaId, that.partidaId) &&
                Objects.equals(timeId, that.timeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partidaId, timeId);
    }


}
