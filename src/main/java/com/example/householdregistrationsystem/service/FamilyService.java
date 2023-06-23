package com.example.householdregistrationsystem.service;

import com.example.householdregistrationsystem.entity.Child;
import com.example.householdregistrationsystem.entity.Family;
import com.example.householdregistrationsystem.entity.Father;
import com.example.householdregistrationsystem.entity.Mother;
import com.example.householdregistrationsystem.repository.FamilyRepository;
import com.example.householdregistrationsystem.request.family.FamilySaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;

import java.sql.Array;
import java.util.ArrayList;

@Service
@Transactional
@RequiredArgsConstructor
public class FamilyService {
    private final FamilyRepository familyRepository;

    public void save(FamilySaveRequest familySaveRequest){
        Father father = new Father();
        father.setName(familySaveRequest.getFatherName());
        father.setAge(familySaveRequest.getFatherAge());
        Mother mother = new Mother();
        mother.setName(familySaveRequest.getMotherName());
        mother.setAge(familySaveRequest.getMotherAge());
        Child child = new Child();
        child.setName(familySaveRequest.getChildName());
        child.setAge(familySaveRequest.getChildAge());
        ArrayList<Child> childArrayList = new ArrayList<>();
        childArrayList.add(child);

        Family family = new Family();
        family.setMother(mother);
        family.setFather(father);
        family.setChild(childArrayList);
        familyRepository.save(family);
    }
}
