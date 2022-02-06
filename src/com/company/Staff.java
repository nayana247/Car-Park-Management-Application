package com.company;

public class Staff extends Driver {

    // define variables
    public String StaffID;

    // default constructor
    public Staff() {
    }

    // overriding constructor
    public Staff(String vehicleNumber, int phoneNumber, String staffID) {
        super(vehicleNumber, phoneNumber);
        StaffID = staffID;
    }

    // getters and setters
    public String getStaffID() {
        return StaffID;
    }

    public void setStaffID(String staffID) {
        StaffID = staffID;
    }
}
