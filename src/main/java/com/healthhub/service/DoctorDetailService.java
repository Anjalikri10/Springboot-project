package com.healthhub.service;

import com.healthhub.entity.DoctorDetail;
import com.healthhub.repository.DoctorDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DoctorDetailService {

    @Autowired
    DoctorDetailRepository repository;
    public DoctorDetail addDetails(DoctorDetail doctorDetail) {
        return repository.save(doctorDetail);
    }

    public DoctorDetail getdrDetailsByEmailAndMob(String email, String mob) {
        return repository.findByEmailAndMob(email,mob);
    }
}
