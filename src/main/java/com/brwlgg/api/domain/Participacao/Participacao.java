package com.brwlgg.api.domain.Participacao;

import com.brwlgg.api.domain.Partida.Partida;
import com.brwlgg.api.domain.Time.Time;
import jakarta.persistence.*;
import lombok.*;

@Entity(name = "participacao")
@Table(name = "participacao")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Participacao {

    @EmbeddedId
    private ParticipacaoPK id;

    @ManyToOne
    @MapsId("partidaId")
    @JoinColumn(name = "partida_id", referencedColumnName = "id")
    private Partida partida;

    @ManyToOne
    @MapsId("timeId")
    @JoinColumn(name = "time_id", referencedColumnName = "id")
    private Time time;

}
