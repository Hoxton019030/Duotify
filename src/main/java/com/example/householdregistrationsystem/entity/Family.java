package com.example.householdregistrationsystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Family {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    @JoinColumn(name = "father-id")
    private Father father;
    @OneToOne
    @JoinColumn(name = "mother-id")
    private Mother mother;
    @OneToMany
    @JoinColumn(name = "family-id")
    private List<Child> child;

}
