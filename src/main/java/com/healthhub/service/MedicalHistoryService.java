package com.healthhub.service;

import com.healthhub.entity.MedicalHistory;
import com.healthhub.repository.MedicalHistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicalHistoryService {

    @Autowired
    MedicalHistoryRepository repository;
    public MedicalHistory addDetail(MedicalHistory medicalHistory) {
        return repository.save(medicalHistory);
    }

    public MedicalHistory getMedicalHistoryByMobAndEmail(String mob, String email) {
        return repository.findByMobAndEmail(mob,email);
    }
}
