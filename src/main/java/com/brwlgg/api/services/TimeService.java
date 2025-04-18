package com.brwlgg.api.services;

import com.brwlgg.api.domain.Evento.Evento;
import com.brwlgg.api.domain.Jogador.Jogador;
import com.brwlgg.api.domain.Time.Time;
import com.brwlgg.api.domain.Time.TimeRequestDTO;
import com.brwlgg.api.domain.Time.TimeResponseDTO;
import com.brwlgg.api.repositories.EventoRepository;
import com.brwlgg.api.repositories.TimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class TimeService {

    @Autowired
    private TimeRepository timeRepository;

    @Autowired
    private EventoRepository eventoRepository;

    public TimeResponseDTO criarTime(TimeRequestDTO timeRequestDTO) {
        Time time = new Time();
        time.setNome(timeRequestDTO.nome());
        time.setRegiao(timeRequestDTO.regiao());

        if (timeRequestDTO.jogadores().isPresent()) {
            time.setJogadores(timeRequestDTO.jogadores().get().stream()
                    .map(Jogador::new)
                    .collect(Collectors.toList()));
        } else {
            time.setJogadores(new ArrayList<>());
        }

        if (timeRequestDTO.eventosId() != null && !timeRequestDTO.eventosId().isEmpty()) {
            List<Evento> eventos = timeRequestDTO.eventosId().stream()
                    .map(eventosId -> eventoRepository.findById(eventosId)
                            .orElseThrow(() -> new ResponseStatusException(HttpStatus.BAD_REQUEST, "Evento com ID " + eventosId + " não encontrado")))
                    .collect(Collectors.toList());
            time.setEventos(eventos);
        } else {
            time.setEventos(new ArrayList<>());
        }

        Time timeSalvo = timeRepository.save(time);
        return new TimeResponseDTO(timeSalvo);
    }

    public void removerTime(Long id) {
        timeRepository.deleteById(id);
    }

}
