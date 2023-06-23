package com.example.householdregistrationsystem.controller;

import com.example.householdregistrationsystem.request.family.FamilySaveRequest;
import com.example.householdregistrationsystem.service.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FamilyController {

    private final FamilyService familyService;
    @PostMapping("family")
    public void save(@RequestBody FamilySaveRequest familySaveRequest){
        familyService.save(familySaveRequest);
    }
}
