package com.healthhub.controller;


import com.healthhub.entity.PatientDetails;
import com.healthhub.service.PatientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PatientDetailsController {

    @Autowired
    PatientDetailsService service;

    @PostMapping("/addPatient")
    public PatientDetails addDetails(PatientDetails details) {
        return service.addPatient(details);
    }

    @PostMapping("/get")
    public List<PatientDetails> allDetails() {
        return service.getAllDetails();
    }
}
