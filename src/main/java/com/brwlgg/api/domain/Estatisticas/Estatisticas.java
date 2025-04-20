package com.brwlgg.api.domain.Estatisticas;

import com.brwlgg.api.domain.Jogador.Jogador;
import com.brwlgg.api.domain.PartidaPossuiModo.PartidaPossuiModo;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import lombok.*;

@Entity(name = "estatisticas")
@Table(name = "estatisticas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Estatisticas {

   @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "jogador_id", referencedColumnName = "id", nullable = false)
    private Jogador jogador;

    @Column(name = "brawler")
    private String brawler;

    @ManyToOne
    @JoinColumns({
       @JoinColumn(name = "partida_id", referencedColumnName = "partida_id"), // referencedColumnName corresponde ao nome da coluna na tabela partida_possui_modo
       @JoinColumn(name = "modo_id", referencedColumnName = "modo_id")        // referencedColumnName corresponde ao nome da coluna na tabela partida_possui_modo
    })
    private PartidaPossuiModo partidaPossuiModo;

    @Min(0)
    private int kills;

    @Min(0)
    private int deaths;

    @Min(0)
    private int dps;

    public Estatisticas(EstatisticasRequestDTO dto, Jogador jogador, String brawler, PartidaPossuiModo partidaPossuiModo) {
        this.jogador = jogador;
        this.brawler = brawler;
        this.partidaPossuiModo = partidaPossuiModo;
        this.kills = dto.kills();
        this.deaths = dto.deaths();
        this.dps = dto.dps();
    }
}

