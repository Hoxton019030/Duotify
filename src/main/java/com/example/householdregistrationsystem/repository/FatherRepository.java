package com.example.householdregistrationsystem.repository;

import com.example.householdregistrationsystem.entity.Father;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FatherRepository extends JpaRepository<Father,Long> {
}
