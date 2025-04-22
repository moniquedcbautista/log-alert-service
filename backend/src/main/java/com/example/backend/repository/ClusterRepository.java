package com.example.backend.repository;

import com.example.backend.model.Cluster;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClusterRepository extends JpaRepository<Cluster, String> {
    Optional<Cluster> findByName(String name);
}
