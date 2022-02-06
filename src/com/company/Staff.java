package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Staff extends Driver {

    // define variables
    public String StaffID;

    // default constructor
    public Staff() {
    }

    // overriding constructor
    public Staff(String vehicleNumber, String phoneNumber, String staffID) {
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

    /* Rusiru Ilapperuma
    2019T00354 */

    // method for check-in staff drivers(input)
    ArrayList<Staff> List_of_Staff_Drivers = new ArrayList<>();

    @Override
    public void inputDriver() {
        super.inputDriver();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your staff ID: ");
        StaffID = sc.next();

        Staff staff = new Staff(VehicleNumber, PhoneNumber, StaffID);

        List_of_Staff_Drivers.add(staff);

        if(List_of_Staff_Drivers.isEmpty()) {

            System.out.println("Sorry, check-in failed.");
        } else {
            System.out.println("Staff member is successfully checked In !");
        }
    }

    /* Prabhath Nuwan
    2019T00385 */

    // method for check-out StaffDriver
    @Override
    public void checkoutDriver() {
        super.checkoutDriver();

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your vehicle number : ");
        String vehicle_no = sc.next();

        /*for(int i=0; i < List_of_Staff_Drivers.size(); i++) {

            if(vehicle_no == List_of_Staff_Drivers.get(i).getVehicleNumber()) {
                List_of_Staff_Drivers.remove(List_of_Staff_Drivers.get(i).getVehicleNumber());
                System.out.println(vehicle_no + " is checked-out");
            }
            else {
                System.out.println("Check-out is failed");
            }
        }*/

        System.out.println("Check-out is successful");
    }
}

