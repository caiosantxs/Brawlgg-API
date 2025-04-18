package com.brwlgg.api.domain.Evento;

import jakarta.validation.constraints.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.util.List;

public record EventoRequestDTO(

        @NotBlank
        @Size(min = 3, max = 30, message = "O nome deve ter entre 3 e 30 caracteres")
        String nome,

        @NotNull
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        LocalDate data_inicio,

        @NotNull
        @DateTimeFormat(pattern = "yyyy-MM-dd")
        LocalDate data_fim,

        @NotNull
        @DecimalMin(value = "0.0", inclusive = false, message = "A premiação deve ser maior que zero")
        Double premiacao,

        @NotBlank
        String local,

        @NotBlank
        String status,

        List<Long> timeIds

) {}

