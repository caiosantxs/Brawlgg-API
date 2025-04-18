package com.brwlgg.api.domain.PartidaPossuiModo;

import com.brwlgg.api.domain.ModoJogo.ModoJogo;
import com.brwlgg.api.domain.Partida.Partida;
import com.brwlgg.api.domain.Time.Time;
import com.brwlgg.api.domain.Estatisticas.Estatisticas;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity(name = "PartidaPossuiModo")
@Table(name = "partida_possui_modo")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PartidaPossuiModo {

    @EmbeddedId
    private PartidaPossuiModoPK id;

    @ManyToOne
    @MapsId("partidaId")
    @JoinColumn(name = "partida_id", referencedColumnName = "id")
    private Partida partida;

    @ManyToOne
    @MapsId("modoJogoId")
    @JoinColumn(name = "modo_id", referencedColumnName = "id")
    private ModoJogo modoDeJogo;

    @OneToMany(mappedBy = "partidaPossuiModo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Estatisticas> estatisticas;

    @ManyToOne
    @JoinColumn(name = "time_vencedor_id", referencedColumnName = "id")
    private Time timeVencedor;

    @Column(name = "pontucao_time1")
    private Integer pontuacaoTime1;

    @Column(name = "pontucao_time2")
    private Integer pontuacaoTime2;

}
