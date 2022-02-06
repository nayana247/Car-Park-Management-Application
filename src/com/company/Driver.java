package com.company;

import java.util.Scanner;

public class Driver {

    // define variables
    public String VehicleNumber;
    public String PhoneNumber;

    // default constructor
    public Driver() {
    }

    // overriding constructor
    public Driver(String vehicleNumber, String phoneNumber) {
        VehicleNumber = vehicleNumber;
        PhoneNumber = phoneNumber;
    }

    // getters and setters
    public String getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    // method for check-in drivers(input)
    public void inputDriver() {

        System.out.println();
        System.out.println("Please Enter Following Details to Check In");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your vehicle number : ");
        VehicleNumber = sc.next();

        System.out.println("Enter phone number : ");
        PhoneNumber = sc.next();
    }

    // method for check-out
    public void checkoutDriver() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Are you sure, you want to check-out?");
        String container = sc.next();
    }
}