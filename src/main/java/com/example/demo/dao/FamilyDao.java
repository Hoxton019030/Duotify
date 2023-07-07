package com.example.demo.dao;

import com.example.demo.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FamilyDao extends JpaRepository<Family, Long> {

    Family findByName(String familyName);

    Family findByFather_Name(String fatherName);

}
