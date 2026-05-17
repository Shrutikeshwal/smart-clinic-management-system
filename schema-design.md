# Smart Clinic Management System - MySQL Schema Design

## Database Name

smart_clinic_db

---

## Table 1: Doctor

| Field Name       | Data Type        | Constraints                  |
|------------------|------------------|------------------------------|
| doctor_id        | BIGINT           | PRIMARY KEY, AUTO_INCREMENT  |
| doctor_name      | VARCHAR(100)     | NOT NULL                     |
| specialization   | VARCHAR(100)     | NOT NULL                     |

---

## Table 2: Patient

| Field Name       | Data Type        | Constraints                  |
|------------------|------------------|------------------------------|
| patient_id       | BIGINT           | PRIMARY KEY, AUTO_INCREMENT  |
| patient_name     | VARCHAR(100)     | NOT NULL                     |
| email            | VARCHAR(150)     | UNIQUE                       |
| phone            | VARCHAR(20)      | NOT NULL                     |

---

## Table 3: Appointment

| Field Name       | Data Type         | Constraints                  |
|------------------|-------------------|------------------------------|
| appointment_id   | BIGINT            | PRIMARY KEY, AUTO_INCREMENT  |
| doctor_id        | BIGINT            | FOREIGN KEY                  |
| patient_id       | BIGINT            | FOREIGN KEY                  |
| appointment_time | DATETIME          | NOT NULL                     |

---

## Table 4: Admin

| Field Name       | Data Type        | Constraints                  |
|------------------|------------------|------------------------------|
| admin_id         | BIGINT           | PRIMARY KEY, AUTO_INCREMENT  |
| admin_name       | VARCHAR(100)     | NOT NULL                     |
| email            | VARCHAR(150)     | UNIQUE                       |
| password         | VARCHAR(255)     | NOT NULL                     |

---

## Foreign Key Relationships

### Appointment Table Relationships

- doctor_id references Doctor(doctor_id)
- patient_id references Patient(patient_id)

This ensures that every appointment is linked to a valid doctor and patient.

---

## Summary

This schema supports:

- Doctor Management
- Patient Management
- Appointment Scheduling
- Admin Control
- Reporting and Future Expansion