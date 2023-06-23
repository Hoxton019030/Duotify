package com.example.householdregistrationsystem.service;

import com.example.householdregistrationsystem.entity.Father;
import com.example.householdregistrationsystem.repository.FatherRepository;
import com.example.householdregistrationsystem.request.father.FatherSaveRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
@RequiredArgsConstructor
public class FatherService {


    final FatherRepository fatherRepository;

    public void save(FatherSaveRequest fatherSaveRequest){
        Father father = new Father();
        father.setName(fatherSaveRequest.getName());
        father.setAge(fatherSaveRequest.getAge());
        fatherRepository.save(father);
    }
}
