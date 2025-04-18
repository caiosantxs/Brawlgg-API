package com.brwlgg.api.repositories;

import com.brwlgg.api.domain.Brawler.Brawler;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BrawlerRepository extends JpaRepository<Brawler, Long> {
}
