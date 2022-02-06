package com.company;

import java.util.ArrayList;

public class ParkingSlot {

    // define variables
    public String ParkingSlot_ID;
    public String ParkingSlot_GPSCoordinates;
    public String ParkingSlot_Indicator;

    // default constructor
    public ParkingSlot() {
    }

    // overriding constructor
    public ParkingSlot(String parkingSlot_ID, String parkingSlot_GPSCoordinates, String parkingSlot_Indicator) {
        ParkingSlot_ID = parkingSlot_ID;
        ParkingSlot_GPSCoordinates = parkingSlot_GPSCoordinates;
        ParkingSlot_Indicator = parkingSlot_Indicator;
    }

    // getters and setters
    public String getParkingSlot_ID() {
        return ParkingSlot_ID;
    }

    public void setParkingSlot_ID(String parkingSlot_ID) {
        ParkingSlot_ID = parkingSlot_ID;
    }

    public String getParkingSlot_GPSCoordinates() {
        return ParkingSlot_GPSCoordinates;
    }

    public void setParkingSlot_GPSCoordinates(String parkingSlot_GPSCoordinates) {
        ParkingSlot_GPSCoordinates = parkingSlot_GPSCoordinates;
    }

    public String getParkingSlot_Indicator() {
        return ParkingSlot_Indicator;
    }

    public void setParkingSlot_Indicator(String parkingSlot_Indicator) {
        ParkingSlot_Indicator = parkingSlot_Indicator;
    }

    // method for find available parking slots
    public void AvailableParkingSlots(ParkingSlot parkingSlot) {
        ArrayList<ParkingSlot> List_of_Available_Parking_Slots = new ArrayList<ParkingSlot>();
        if(parkingSlot.getParkingSlot_Indicator() == "Available") {
            List_of_Available_Parking_Slots.add(parkingSlot);
        }

        for(int i=0; i<List_of_Available_Parking_Slots.size(); i++) {
            System.out.println(List_of_Available_Parking_Slots.get(i).getParkingSlot_ID() + "\t | \t" + List_of_Available_Parking_Slots.get(i).getParkingSlot_GPSCoordinates() + "\t | \t" +  List_of_Available_Parking_Slots.get(i).getParkingSlot_Indicator());
        }
    }
}
