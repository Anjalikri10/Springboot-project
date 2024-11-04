package com.healthhub.controller;

import com.healthhub.entity.LabTest;
import com.healthhub.service.LabTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/labtest")
public class LabTestController {
    @Autowired
    LabTestService service;
    @PostMapping("/add")
    public LabTest addDetails(@RequestBody LabTest labTest ){
        return service. addDetails(labTest);
    }
    @PostMapping("/getbytestname")
      public LabTest getTestDetailsByMobAndEmail(@RequestBody LabTest labTest){
        return service.getbyTestName(labTest.getTest_name());
      }
}
