package com.example.householdregistrationsystem.controller;

import com.example.householdregistrationsystem.request.father.FatherSaveRequest;
import com.example.householdregistrationsystem.service.FatherService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class FatherController {

    final FatherService fatherService;

    @PostMapping("father")
    public void save(@RequestBody FatherSaveRequest fatherSaveRequest) {
        fatherService.save(fatherSaveRequest);
    }
}
