package com.clinic.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/prescriptions")
public class PrescriptionController {

    @PostMapping("/save")
    public ResponseEntity<?> savePrescription(
            @RequestHeader("Authorization") String token,
            @RequestBody String prescriptionData) {

        if (token == null || token.isEmpty()) {
            return ResponseEntity.badRequest()
                    .body("Invalid token");
        }

        if (prescriptionData == null || prescriptionData.isEmpty()) {
            return ResponseEntity.badRequest()
                    .body("Prescription data is required");
        }

        return ResponseEntity.ok(
                "Prescription saved successfully"
        );
    }
}