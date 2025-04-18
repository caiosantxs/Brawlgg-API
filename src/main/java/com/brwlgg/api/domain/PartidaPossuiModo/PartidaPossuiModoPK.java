package com.brwlgg.api.domain.PartidaPossuiModo;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
@Getter
@Setter
public class PartidaPossuiModoPK implements Serializable {

    @Column(name = "partida_id")
    private Long partidaId;

    @Column(name = "modo_id")
    private Long modoJogoId;

    public PartidaPossuiModoPK() {}

    public PartidaPossuiModoPK(Long partidaId, Long modoJogoId) {
        this.partidaId = partidaId;
        this.modoJogoId = modoJogoId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PartidaPossuiModoPK that = (PartidaPossuiModoPK) o;
        return Objects.equals(partidaId, that.partidaId) &&
               Objects.equals(modoJogoId, that.modoJogoId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(partidaId, modoJogoId);
    }
}
