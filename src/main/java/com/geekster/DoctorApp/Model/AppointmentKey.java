package com.geekster.DoctorApp.Model;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.time.LocalDateTime;

public class AppointmentKey {

    @Embeddable
    public class AppointmentKey implements Serializable {

        @GeneratedValue(strategy = GenerationType.AUTO)
        public Long appId;
        public LocalDateTime time;
}
