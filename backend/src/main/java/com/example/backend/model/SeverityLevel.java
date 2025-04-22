package com.example.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "severity_levels")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
@Data
public class SeverityLevel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "severity_id")
    private Integer severityId;

    private String label;
    private Integer level;
    private String colorCode;
    private String description;
}
