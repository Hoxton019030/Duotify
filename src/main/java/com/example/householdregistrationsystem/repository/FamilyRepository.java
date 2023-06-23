package com.example.householdregistrationsystem.repository;

import com.example.householdregistrationsystem.entity.Family;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilyRepository extends JpaRepository<Family,Long> {
}
