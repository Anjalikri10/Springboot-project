package com.healthhub.controller;


import com.healthhub.entity.MedicalHistory;
import com.healthhub.service.MedicalHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/MedicalHistory")
public class MedicalHistoryController {

    @Autowired
    MedicalHistoryService service;

    @PostMapping("/add")
    public MedicalHistory addDetail(@RequestBody MedicalHistory medicalHistory)
    {
        return service.addDetail(medicalHistory);
    }
    @PostMapping("/getMedHistByMob&Email")
    public MedicalHistory getMedicalHistoryBymobAndEmail(@RequestBody MedicalHistory medicalHistory)
    {
        return service.getMedicalHistoryByMobAndEmail(medicalHistory.getMob(), medicalHistory.getEmail());
    }

}
