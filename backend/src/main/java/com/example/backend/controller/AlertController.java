package com.example.backend.controller;

import com.example.backend.service.AlertService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/alerts") // 👈 make sure this matches your URL base
@RequiredArgsConstructor
public class AlertController {

    private final AlertService alertService;

    @PostMapping("/upload") // 👈 this is /api/alerts/upload
    public ResponseEntity<String> uploadLogFile(@RequestParam("file") MultipartFile file) {
        try {
            alertService.processLogFile(file);
            return ResponseEntity.ok("Log file processed and saved to Alerts.");
        } catch (Exception e) {
            e.printStackTrace();
            return ResponseEntity.status(500).body("Failed to process log file.");
        }
    }
}
