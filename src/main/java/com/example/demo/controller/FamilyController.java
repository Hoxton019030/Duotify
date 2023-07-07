package com.example.demo.controller;

import com.example.demo.entity.Family;
import com.example.demo.request.FamilySaveRequest;
import com.example.demo.service.FamilyService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("family")
public class FamilyController {

    final FamilyService familyService;

    @PostMapping()
    public ResponseEntity<String> addFamily(@RequestBody FamilySaveRequest familySaveRequest) {
        familyService.addFamily(familySaveRequest);
        return ResponseEntity.status(HttpStatus.OK).body("新增成功");
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Family> findById(@PathVariable("id") Long id) {
//        Family familyByAddress = familyService.findFamilyByAddress(id);
//        return ResponseEntity.ok().body(familyByAddress);
//    }

    @GetMapping("/{familyName}")
    public ResponseEntity<Family> findById(@PathVariable("familyName") String familyName) {
        Family byFamilyName = familyService.findByFamilyName(familyName);
        return ResponseEntity.ok().body(byFamilyName);
    }

}
