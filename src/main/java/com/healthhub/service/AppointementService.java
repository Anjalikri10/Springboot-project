package com.healthhub.service;

import com.healthhub.entity.Appointement;
import com.healthhub.repository.AppointementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppointementService {

    @Autowired
    AppointementRepository repository;
    public Appointement addDetail(Appointement appointement) {
        return repository.save(appointement);
    }

    public Appointement getAppointDetailByMobAndEmail(String mob, String email) {
        return repository.findByEmailAndMob(mob,email);
    }
}
