package com.example.demo.service;

import com.example.demo.entity.Family;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class FamilyServiceTest {

    @Autowired
    FamilyService familyService;

    @Test
    @Transactional
    void test(){
        Family byFamilyName = familyService.findByFamilyName("我們這一家");

        System.out.println(byFamilyName.getChildList().get(0));

    }
}