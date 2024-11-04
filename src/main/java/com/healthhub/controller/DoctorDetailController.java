package com.healthhub.controller;


import com.healthhub.entity.DoctorDetail;
import com.healthhub.service.DoctorDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/doctordetail")
public class DoctorDetailController {

    @Autowired
    DoctorDetailService service;

    @PostMapping("/add")
    public DoctorDetail  addDetails(@RequestBody DoctorDetail doctorDetail){
        return service.addDetails(doctorDetail);
    }
    @PostMapping("/getdrdetail")
    public DoctorDetail getdrDetailsBYEmailAndMob(@RequestBody DoctorDetail doctorDetail){
        return service.getdrDetailsByEmailAndMob(doctorDetail.getEmail() ,doctorDetail.getMob());
    }
}
