package com.brwlgg.api.domain.Time;


import com.brwlgg.api.domain.Evento.Evento;
import com.brwlgg.api.domain.Jogador.Jogador;
import com.brwlgg.api.repositories.EventoRepository;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "time")
@Table(name = "time")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(mappedBy = "time", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Jogador> jogadores;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "regiao", nullable = false)
    private String regiao;

    @ManyToMany(mappedBy = "times")
    private List<Evento> eventos;

}

