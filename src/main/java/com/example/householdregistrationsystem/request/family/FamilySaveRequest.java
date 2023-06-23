package com.example.householdregistrationsystem.request.family;

import lombok.Data;

@Data
public class FamilySaveRequest {
    String fatherName;
    int fatherAge;
    String motherName;
    int motherAge;
    String childName;
    int childAge;
}
