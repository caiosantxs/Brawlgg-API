package com.brwlgg.api.domain.Partida;

import com.brwlgg.api.domain.Participacao.Participacao;
import com.brwlgg.api.domain.PartidaPossuiModo.PartidaPossuiModo;
import com.brwlgg.api.domain.Time.Time;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity(name="partida")
@Table(name="partida")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Partida {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "data")
    private LocalDate data;

    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "time_vencedor_id", referencedColumnName = "id")
    private Time timeVencedor;

    @Column(name = "pontuacaoTime1")
    private Integer pontuacaoTime1;

    @Column(name = "pontuacaoTime2")
    private Integer pontuacaoTime2;

    @OneToMany(mappedBy = "partida")
    private List<Participacao> participacoes;

    @OneToMany(mappedBy = "partida", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<PartidaPossuiModo> modosDeJogo;
}
