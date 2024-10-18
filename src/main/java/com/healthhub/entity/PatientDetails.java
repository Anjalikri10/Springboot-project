package com.healthhub.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.cglib.core.Local;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//@Table(name ="xyz")--for changing the table name
public class PatientDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private  String name;
    private String gender;
    private  int age;
    @Column(length=10,unique = true ,nullable = false)
    private String mob;
    @Column(length = 50)
    private String  email;
    private String address;
    private Local dateOfReg;
    @Column(unique = true)
    private String aadharId;

}
