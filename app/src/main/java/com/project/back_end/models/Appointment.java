package com.project.back_end.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @NotNull(message = "A chaque rendez-vous doit etre attribué un médecin !")
    private Doctor doctor;

    @ManyToOne
    @NotNull(message = "Chaque rendez-vous doit etre lié à un patient")
    private Patient patient;

    @Future(message = "L'heure du rendez-vous doit être dans le futur")
    private LocalDateTime appointmentTime;

    @NotNull
    private int status;

    public void setId(final Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public int getStatus() {
        return status;
    }

    public LocalDateTime getAppointmentTime() {
        return appointmentTime;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setAppointmentTime(final LocalDateTime appointmentTime) {
        this.appointmentTime = appointmentTime;
    }

    public void setDoctor(final Doctor doctor) {
        this.doctor = doctor;
    }

    public void setPatient(final Patient patient) {
        this.patient = patient;
    }

    public void setStatus(final int status) {
        this.status = status;
    }

    public LocalDateTime getEndTime(){
        return this.appointmentTime.plusHours(1);
    }

    public LocalDate getAppointmentDate(){
        return this.appointmentTime.toLocalDate();
    }

    public LocalTime getAppointmentTimeOnly(){
        return this.appointmentTime.toLocalTime();
    }
}

