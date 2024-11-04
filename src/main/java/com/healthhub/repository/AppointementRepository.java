package com.healthhub.repository;


import com.healthhub.entity.Appointement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface AppointementRepository extends JpaRepository<Appointement,Long> {
    @Query(value="select * from appointement where mob=? and email=?" , nativeQuery = true)
    Appointement findByEmailAndMob(String mob, String email);
}
