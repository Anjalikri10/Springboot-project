package com.healthhub.service;

import com.healthhub.entity.MedicalBill;
import com.healthhub.repository.MedicalBillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class MedicalBillService {

    @Autowired
    MedicalBillRepository repository;
    public MedicalBill addDetail(MedicalBill medicalBill) {
        medicalBill.setTotal_charge(medicalBill.getMedicine_charge()+medicalBill.getDr_charge() + medicalBill.getLab_charge() +medicalBill.getCleaning_charge() + medicalBill.getBed_charge());
        return repository.save(medicalBill);
    }

    public MedicalBill getMedicalBillByMobAndEmail(String mob, String email) {
        return repository.findByMobandEmail(mob,email);
    }
}
