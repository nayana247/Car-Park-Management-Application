package com.company;

public class Standard extends ParkingSlot {

    // default constructor
    public Standard() {
    }

    // overriding constructor
    public Standard(String parkingSlot_ID, String parkingSlot_GPSCoordinates, String parkingSlot_Indicator) {
        super(parkingSlot_ID, parkingSlot_GPSCoordinates, parkingSlot_Indicator);
    }
}
