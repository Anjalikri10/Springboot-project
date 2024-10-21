package com.healthhub.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.time.LocalDate;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name ="xyz")--for changing the table name
@Table(name="patients")
public class PatientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private  String name;
    private String gender;
    private  int age;
    @Column(length=10,unique = true ,nullable = false)
    private String mob;
    private String  email;
    private String address;
    @Column(nullable = false)
    private LocalDate dateOfReg = LocalDate.now();
    @Column(unique = true)
    private String aadharId;

}
