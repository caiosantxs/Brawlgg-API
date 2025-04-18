package com.brwlgg.api.domain.ModoJogo;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "ModoDeJogo")
@Table(name = "modo_de_jogo")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@EqualsAndHashCode(of = "id")
public class ModoJogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Setter
    private String nome;

    @Setter
    private String descricao;

}
