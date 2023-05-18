package com.geekster.DoctorApp.Service;

import com.geekster.DoctorApp.Model.Appointment;
import com.geekster.DoctorApp.Model.AppointmentKey;
import com.geekster.DoctorApp.Repository.IAppointmentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {

    @Autowired
    IAppointmentRepo appointmentRepo;

    public void bookAppointment(Appointment appointment) {
        appointmentRepo.save(appointment);
    }

    public void cancelAppointment(AppointmentKey key) {
        appointmentRepo.deleteById(key);
    }
}
