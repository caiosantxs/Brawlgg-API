package com.brwlgg.api.domain.Time;

import com.brwlgg.api.domain.Evento.EventoResponseDTO;
import com.brwlgg.api.domain.Jogador.Jogador;
import com.brwlgg.api.domain.Jogador.JogadorResponseDTO;

import java.util.List;
import java.util.stream.Collectors;

public record TimeResponseDTO(

        Long id,
        List<JogadorResponseDTO>Jogadores,
        String nome,
        String regiao,
        List<EventoResponseDTO> evento
){
    public TimeResponseDTO(Time time) {
        this(time.getId(),
             time.getJogadores().stream()
                 .map(JogadorResponseDTO::new)
                 .collect(Collectors.toList()),
             time.getNome(),
             time.getRegiao(),
             time.getEventos().stream()
                        .map(EventoResponseDTO::new)
                        .collect(Collectors.toList())
        );
        ;
    }
}

