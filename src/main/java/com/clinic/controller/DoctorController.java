package com.clinic.controller;

import com.clinic.service.DoctorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/doctors")
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {
        this.doctorService = doctorService;
    }

    @GetMapping("/availability")
    public ResponseEntity<?> getDoctorAvailability(
            @RequestParam Long doctorId,
            @RequestParam String date,
            @RequestHeader("Authorization") String token) {

        if (token == null || token.isEmpty()) {
            return ResponseEntity.badRequest()
                    .body("Invalid token");
        }

        return ResponseEntity.ok(
                doctorService.getAvailableTimeSlots(doctorId, date)
        );
    }
}