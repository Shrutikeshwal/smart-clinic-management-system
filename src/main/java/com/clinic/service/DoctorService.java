package com.clinic.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class DoctorService {

    public List<String> getAvailableTimeSlots(Long doctorId, String date) {
        return Arrays.asList(
                "10:00 AM",
                "11:00 AM",
                "2:00 PM",
                "4:00 PM"
        );
    }

    public ResponseEntity<String> validateDoctorLogin(String email, String password) {
        if ("doctor@gmail.com".equals(email) && "12345".equals(password)) {
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.badRequest().body("Invalid credentials");
        }
    }
}