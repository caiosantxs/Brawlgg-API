package com.brwlgg.api.domain.Evento;

import com.brwlgg.api.domain.Time.TimeResponseDTO;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public record EventoResponseDTO(
        Long id,
        String nome,
        LocalDate data_inicio,
        LocalDate data_fim,
        Double premiacao,
        String local,
        String status,
        List<TimeResponseDTO> times
        )
{
        public EventoResponseDTO(Evento evento){
                this(evento.getId(),
                        evento.getNome(),
                        evento.getData_inicio(),
                        evento.getData_fim(),
                        evento.getPremiacao(),
                        evento.getLocal(),
                        evento.getStatus(),
                        evento.getTimes().stream().map(TimeResponseDTO::new)
                                .collect(Collectors.toList())
                );
        }
}
