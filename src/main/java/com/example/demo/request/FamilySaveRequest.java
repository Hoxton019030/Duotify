package com.example.demo.request;

import lombok.Data;

import java.util.ArrayList;

@Data
public class FamilySaveRequest {
    String familyName;
    String fatherName;
    String motherName;
    ArrayList<String> childrenNameList;
}
