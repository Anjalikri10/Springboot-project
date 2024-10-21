package com.healthhub.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class MedicalHistory {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String patientname;
    private int age;
    @Column(length=10,nullable = false)
    private String mob;
    private String email;
    private String disease;
    private String diagnosedByDoctor;
    private String test;
    private String reportRemark;
    private String medicine;
}
