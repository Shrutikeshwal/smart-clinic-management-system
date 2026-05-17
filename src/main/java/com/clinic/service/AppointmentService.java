package com.clinic.service;

import com.clinic.entity.Appointment;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class AppointmentService {

    public Appointment bookAppointment(Appointment appointment) {
        // Normally save using repository
        return appointment;
    }

    public List<Appointment> getAppointmentsForDoctor(Long doctorId, LocalDate date) {
        // Normally fetch from database
        return new ArrayList<>();
    }
}