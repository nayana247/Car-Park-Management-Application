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