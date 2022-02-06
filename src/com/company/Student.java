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

    // method for check-in student drivers(input)
    ArrayList<Student> List_of_Student_Drivers = new ArrayList<>();

    @Override
    public void inputDriver() {
        super.inputDriver();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your student ID: ");
        StudentID = sc.next();

        Student student = new Student(VehicleNumber, PhoneNumber, StudentID);

        List_of_Student_Drivers.add(student);

        if(List_of_Student_Drivers.isEmpty()) {

            System.out.println("Sorry, check-in failed.");
        } else {
            System.out.println("Student is successfully checked-in!");
        }
    }

    // method for check-out StudentDriver
    @Override
    public void checkoutDriver() {
        super.checkoutDriver();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your vehicle number : ");
        String vehicle_no = sc.next();

        /*for(int i=0; i < List_of_Student_Drivers.size(); i++) {

            if(vehicle_no == List_of_Student_Drivers.get(i).getVehicleNumber()) {
                List_of_Student_Drivers.remove(List_of_Student_Drivers.get(i).getVehicleNumber());
                System.out.println(vehicle_no + " is checked-out");
            }
            else {
                System.out.println("Check-out is failed");
            }
        }*/

        System.out.println("Check-out is successful");
    }
}
