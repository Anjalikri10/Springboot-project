package com.healthhub.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DoctorDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long dr_id;
    private String name;
    private String email;
    private String mob;
    private String qualification;
    private String specialization;
    private String experience;
}
