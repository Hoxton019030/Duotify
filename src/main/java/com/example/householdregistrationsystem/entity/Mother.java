package com.example.householdregistrationsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Mother {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    @OneToOne
    private Family family;

}
