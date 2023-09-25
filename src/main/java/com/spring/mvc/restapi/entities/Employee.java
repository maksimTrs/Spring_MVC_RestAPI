package com.spring.mvc.restapi.entities;


import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.math.BigInteger;

@Entity
@Table(name = "employees")
@Setter
@Getter
@ToString
@NoArgsConstructor
@RequiredArgsConstructor  // custom constructor for all fields with @NonNull
public class Employee {


    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @NonNull
    @Column(name = "name")
    private String name;
    @NonNull
    @Column(name = "surname")
    private String surname;
    @NonNull
    @Column(name = "department")
    private String department;
    @NonNull
    @Column(name = "salary")
    private BigInteger salary;
}
