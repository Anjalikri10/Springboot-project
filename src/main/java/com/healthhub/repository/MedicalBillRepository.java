package com.healthhub.repository;

import com.healthhub.entity.MedicalBill;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicalBillRepository  extends JpaRepository<MedicalBill , Long> {

    MedicalBill findByMobandEmail(String mob, String email);
}
