package com.healthhub.service;


import com.healthhub.entity.PatientDetails;
import com.healthhub.repository.PatientDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Service
public class PatientDetailsService {

    @Autowired
    PatientDetailsRepository repository;

    public PatientDetails addPatient(PatientDetails details) {

        return repository.save(details);
    }

    public List<PatientDetails> getAllDetails() {

        return repository.findAll();
    }
}


