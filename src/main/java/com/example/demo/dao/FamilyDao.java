package com.example.demo.dao;

import com.example.demo.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface FamilyDao extends JpaRepository<Family, Long> {

    Family findFamilyByName(String familyName);


//    @Query("SELECT f from Family f INNER JOIN ")
//    Family findFamilyByFatherName(String fatherName)

}
