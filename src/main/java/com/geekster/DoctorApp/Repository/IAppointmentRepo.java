package com.geekster.DoctorApp.Repository;

import com.geekster.DoctorApp.Model.Appointment;
import com.geekster.DoctorApp.Model.AppointmentKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppointmentRepo extends JpaRepository<Appointment, AppointmentKey> {

    public String findByIdAppId(Long id);
}
