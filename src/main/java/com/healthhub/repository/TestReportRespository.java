package com.healthhub.repository;

import com.healthhub.entity.TestReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TestReportRespository extends JpaRepository<TestReport,Long> {
    @Query(value="select * from test_report where email=? and mob=?", nativeQuery = true)
    TestReport findTestreportByMobandEmail(String email, String mob);
}
