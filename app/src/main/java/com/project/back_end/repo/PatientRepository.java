package com.project.back_end.repo;

import com.project.back_end.models.Patient;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {

    Patient findByEmail(final @NotNull @Email String email);

    Patient findByEmailOrPhone(final @NotNull @Email String email, final @NotNull @Pattern(regexp = "^[0-9]{10}$") String phone);

}

