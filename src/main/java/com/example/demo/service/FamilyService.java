package com.example.demo.service;

import com.example.demo.dao.FamilyDao;
import com.example.demo.entity.Child;
import com.example.demo.entity.Family;
import com.example.demo.entity.Father;
import com.example.demo.entity.Mother;
import com.example.demo.request.FamilySaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FamilyService {
    final FamilyDao familyDao;

    public void addFamily(FamilySaveRequest familySaveRequest) {
        Family family = new Family();
        Father father = new Father();
        Mother mother = new Mother();
        ArrayList<Child> children = new ArrayList<>();

        father.setName(familySaveRequest.getFatherName());
        mother.setName(familySaveRequest.getMotherName());
        family.setName(familySaveRequest.getFamilyName());
        ArrayList<String> childrenNameList = familySaveRequest.getChildrenNameList();

        for (String childName : childrenNameList) {
            Child child = new Child();
            child.setName(childName);
            children.add(child);
        }

        family.setFather(father);
        family.setMother(mother);
        family.setChildList(children);
        familyDao.save(family);
    }

    public Family findFamilyByAddress(Long id) {
        return familyDao.findById(id).orElse(new Family());
    }

    public Family findByFamilyName(String familyName){
        return familyDao.findByFather_Name(familyName);
    }


}
