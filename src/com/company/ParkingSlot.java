package com.company;

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
}
