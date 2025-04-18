package com.brwlgg.api.domain.Brawler;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name = "brawler")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Brawler {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", unique = true, nullable = false)
    private String nome;

    @Column(name = "raridade", unique = true, nullable = false)
    private String raridade;
}
