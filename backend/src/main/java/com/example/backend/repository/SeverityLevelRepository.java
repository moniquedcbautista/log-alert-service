package com.example.backend.repository;

import com.example.backend.model.SeverityLevel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SeverityLevelRepository extends JpaRepository<SeverityLevel, Integer> {
    Optional<SeverityLevel> findByLabel(String label);
}
