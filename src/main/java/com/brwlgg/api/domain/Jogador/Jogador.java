package com.brwlgg.api.domain.Jogador;

import com.brwlgg.api.domain.Time.Time;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity(name="Jogador")
@Table(name="jogador")
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Jogador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "time_id")
    private Time time;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "apelido", nullable = false)
    private String apelido;

    @Column(name = "nacionalidade", nullable = false)
    private String nacionalidade;

    public Jogador(JogadorRequestDTO requestDTO){
        this.nome = requestDTO.nome();
        this.apelido = requestDTO.apelido();
        this.nacionalidade = requestDTO.nacionalidade();
    }

}
