package com.healthhub.service;

import com.healthhub.entity.LabTest;
import com.healthhub.repository.LabRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LabTestService {
    @Autowired
    LabRepository repository;
    public LabTest addDetails(LabTest labTest) {
        return repository.save(labTest);
    }


    public LabTest getbyTestName(String testName) {
        return repository.findBytest_name(testName);
    }
}
