package com.healthhub.repository;

import com.healthhub.entity.DoctorDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface DoctorDetailRepository extends JpaRepository<DoctorDetail, Long> {
    @Query(value= "select * from doctor_detail where  email=? and mob=?" ,nativeQuery = true)


    DoctorDetail findByEmailAndMob(String email, String mob);
}
