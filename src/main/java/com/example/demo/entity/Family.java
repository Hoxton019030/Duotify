package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Family {
    String name;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(cascade = CascadeType.ALL)
    Mother mother;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "father_id")
    Father father;

    @OneToMany(cascade = CascadeType.ALL)
    List<Child> childList;

}
