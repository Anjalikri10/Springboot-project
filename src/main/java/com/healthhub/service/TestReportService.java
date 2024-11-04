package com.healthhub.service;

import com.healthhub.entity.TestReport;
import com.healthhub.repository.TestReportRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestReportService {
    @Autowired
    TestReportRespository respository;

    public TestReport addDetails(TestReport testReport) {
        return respository.save(testReport);
           }


    public TestReport getTestReportBYMobandEmail(String email, String mob) {
        return respository.findTestreportByMobandEmail(email,mob);
    }
}
