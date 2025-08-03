package com.project.back_end.models;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Prescription {

    @Id
    private String id;

    @NotNull
    @Size(min = 3, max = 100)
    private String patientName;

    @NotNull
    private Long appointmentId;

    @NotNull
    @Size(min = 3, max = 100)
    private String medication;

    @NotNull
    private String dosage;

    @Size(max = 200)
    private String doctorNotes;

    public Long getAppointmentId() {
        return appointmentId;
    }

    public String getDoctorNotes() {
        return doctorNotes;
    }

    public String getDosage() {
        return dosage;
    }

    public String getId() {
        return id;
    }

    public String getMedication() {
        return medication;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setId(final String id) {
        this.id = id;
    }

    public void setAppointmentId(final Long appointmentId) {
        this.appointmentId = appointmentId;
    }

    public void setDoctorNotes(final String doctorNotes) {
        this.doctorNotes = doctorNotes;
    }

    public void setDosage(final String dosage) {
        this.dosage = dosage;
    }

    public void setMedication(final String medication) {
        this.medication = medication;
    }

    public void setPatientName(final String patientName) {
        this.patientName = patientName;
    }

}
