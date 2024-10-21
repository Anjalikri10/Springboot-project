package com.healthhub.repository;

import com.healthhub.entity.MedicalHistory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface MedicalHistoryRepository extends JpaRepository<MedicalHistory , Long> {
    @Query(value= "select * from user where mob=? and email=?" ,nativeQuery = true)
    MedicalHistory findByMobAndEmail(String mob, String email);
}
