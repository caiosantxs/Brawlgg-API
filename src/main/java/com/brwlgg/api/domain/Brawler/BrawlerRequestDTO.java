package com.brwlgg.api.domain.Brawler;

import jakarta.validation.constraints.NotBlank;

public record BrawlerRequestDTO(
        @NotBlank String name,
        @NotBlank String raridade
) {
}
