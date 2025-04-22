package com.example.backend.repository;

import com.example.backend.model.AlertType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AlertTypeRepository extends JpaRepository<AlertType, Integer> {
    Optional<AlertType> findByCode(String code);
}
