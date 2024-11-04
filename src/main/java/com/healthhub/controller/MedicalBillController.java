package com.healthhub.controller;


import com.healthhub.entity.MedicalBill;
import com.healthhub.service.MedicalBillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/medicalbill")
public class MedicalBillController {

    @Autowired
  MedicalBillService service;

    @PostMapping("/add")
    public MedicalBill addDetails(@RequestBody MedicalBill medicalBill){
        return service.addDetail(medicalBill);
    }
       @PostMapping("/getMedicalBill")
    public MedicalBill getMedicalBillbyMobandEmail(@RequestBody MedicalBill medicalBill){
        return service.getMedicalBillByMobAndEmail(medicalBill.getmob(),medicalBill.getemail);
    }

}
