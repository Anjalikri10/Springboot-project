package com.healthhub.controller;


import com.healthhub.entity.PatientDetails;
import com.healthhub.service.PatientDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/patients")
public class PatientDetailsController {

    @Autowired
    PatientDetailsService service;

    @PostMapping("/addPatients")
    public PatientDetails addDetails(@RequestBody PatientDetails details) {
        return service.addPatient(details);
    }

    @PostMapping("/get")
    public List<PatientDetails> allDetails() {
        return service.getAllDetails();
    }
}
