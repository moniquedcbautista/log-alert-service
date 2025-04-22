package com.example.backend.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter // ✅ add this to generate getters
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AlertType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer alertTypeId;

    private String name;

    @Column(unique = true)
    private String code;

    private String message;

    private String category;
}
