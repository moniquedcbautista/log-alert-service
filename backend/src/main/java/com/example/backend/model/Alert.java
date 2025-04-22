package com.example.backend.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer alertId;

    @ManyToOne
    @JoinColumn(name = "alert_type_id", nullable = false)
    private AlertType alertType;

    @ManyToOne
    @JoinColumn(name = "severity_id", nullable = false)
    private SeverityLevel severity;

    @ManyToOne
    @JoinColumn(name = "cluster_id", nullable = false)
    private Cluster cluster;

    private LocalDateTime startTime;

    private boolean acknowledged;
}
