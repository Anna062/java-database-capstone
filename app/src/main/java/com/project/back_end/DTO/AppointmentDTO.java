package com.project.back_end.DTO;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@Data
public class AppointmentDTO {

    private Long id;

    private Long doctorId;

    private String doctorName;

    private Long patientId;

    private String patientName;

    private String patientEmail;

    private String patientPhone;

    private String patientAddress;

    private LocalDateTime appointmentTime;

    private LocalDate appointmentDate;

    private LocalTime appointmentTimeOnly;

    private LocalDateTime endTime;

    @Setter
    private int status;

    public LocalDate getAppointmentDate() {
        return this.appointmentTime.toLocalDate();
    }

    public LocalTime getAppointmentTimeOnly() {
        return this.appointmentTime.toLocalTime();
    }

    public LocalDateTime getEndTime() {
        return this.appointmentTime.plusHours(1);
    }

    public AppointmentDTO(Long patientId, String patientName, String patientAddress, String patientEmail, String patientPhone,
                          Long doctorId, String doctorName, LocalDateTime appointmentTime, int status){

        this.patientAddress = patientAddress;
        this.patientEmail = patientEmail;
        this.patientName = patientName;
        this.patientId = patientId;
        this.patientPhone = patientPhone;

        this.doctorId = doctorId;
        this.doctorName = doctorName;

        this.status = status;
        this.appointmentTime = appointmentTime;
        this.appointmentTimeOnly = appointmentTime.toLocalTime();
        this.appointmentDate = appointmentTime.toLocalDate();
        this.endTime = appointmentTime.plusHours(1);
    }
}
