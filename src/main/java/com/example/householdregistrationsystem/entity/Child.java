package com.example.householdregistrationsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Child {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
}
