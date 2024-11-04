package com.healthhub.repository;

import com.healthhub.entity.LabTest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface LabRepository extends JpaRepository<LabTest,Long> {
    @Query(value="select * from lab_test where test_name=?" ,nativeQuery = true)
    LabTest findBytest_name(String testName);
}
