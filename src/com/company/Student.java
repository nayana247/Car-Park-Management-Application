package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Student extends Driver {

    // define variables
    public String StudentID;

    // default constructor
    public Student() {
    }

    // overriding constructor
    public Student(String vehicleNumber, String phoneNumber, String studentID) {
        super(vehicleNumber, phoneNumber);
        StudentID = studentID;
    }

    // getters and setters
    public String getStudentID() {
        return StudentID;
    }

    public void setStudentID(String studentID) {
        StudentID = studentID;
    }