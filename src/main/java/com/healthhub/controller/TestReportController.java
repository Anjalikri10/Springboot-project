package com.healthhub.controller;

import com.healthhub.entity.TestReport;
import com.healthhub.service.TestReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/testreport")
public class TestReportController {
    @Autowired
    TestReportService service;

    @PostMapping("/add")
    public TestReport addDetails(@RequestBody TestReport testReport ){
        return service.addDetails(testReport);
    }

    public TestReport getTestReportBYMobandEmail(@RequestBody TestReport testReport){
        return service.getTestReportBYMobandEmail(testReport.getEmail(), testReport.getMob());
    }
}
