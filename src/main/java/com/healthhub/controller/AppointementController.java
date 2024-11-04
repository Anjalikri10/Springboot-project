package com.healthhub.controller;


import com.healthhub.entity.Appointement;
import com.healthhub.service.AppointementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/appointement")
public class AppointementController {

    @Autowired
    AppointementService service;

    @PostMapping("/add")
    public Appointement addDetail(@RequestBody Appointement appointement){
        return service.addDetail(appointement);
    }
       @PostMapping("/getdetails")
    public Appointement getAppointDetailByMobAndEmail(@RequestBody Appointement appointement)
    {
        return service.getAppointDetailByMobAndEmail(appointement.getMob(),appointement.getEmail());
    }
}
