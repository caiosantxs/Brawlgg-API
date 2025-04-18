package com.brwlgg.api.domain.Evento;

import com.brwlgg.api.domain.Time.Time;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;


import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "evento")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min = 3, max = 30)
    private String nome;

    @NotNull
    private LocalDate data_inicio;

    @NotNull
    private LocalDate data_fim;

    @NotNull
    @DecimalMin(value = "0.0", inclusive = false)
    private Double premiacao;

    @NotBlank
    private String local;

    @NotBlank
    private String status;

    @ManyToMany
    @JoinTable(
            name = "evento_time",
            joinColumns = @JoinColumn(name = "evento_id"),
            inverseJoinColumns = @JoinColumn(name = "time_id")
    )
    private List<Time> times;

}

