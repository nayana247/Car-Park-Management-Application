package com.company;

public class Driver {

    // define variables
    public String VehicleNumber;
    public int PhoneNumber;

    // default constructor
    public Driver() {
    }

    // overriding constructor
    public Driver(String vehicleNumber, int phoneNumber) {
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

    public int getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        PhoneNumber = phoneNumber;
    }
}
