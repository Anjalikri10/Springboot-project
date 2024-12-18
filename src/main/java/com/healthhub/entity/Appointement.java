package com.healthhub.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.sql.Time;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Appointement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private long id;
    private String patientName;
    private int age;
    @Column(length=10,nullable = false)
    private String mob;
    private String department;
    private String email;
    @DateTimeFormat(style = "yyyy-mm-dd")
    private LocalDate appointmentDate;
    @DateTimeFormat(style = "hh:mm")
    private Time appointmentTime;

}
