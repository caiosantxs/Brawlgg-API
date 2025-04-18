package com.brwlgg.api.repositories;

import com.brwlgg.api.domain.Time.Time;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TimeRepository extends JpaRepository<Time, Long> {
}
