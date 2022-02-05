package com.company;

public class Handicapped extends ParkingSlot {

    // define variables
    private String NearestBuildingName;

    // default constructor
    public Handicapped() {
    }

    // overriding constructor
    public Handicapped(String parkingSlot_ID, String parkingSlot_GPSCoordinates, String parkingSlot_Indicator, String nearestBuildingName) {
        super(parkingSlot_ID, parkingSlot_GPSCoordinates, parkingSlot_Indicator);
        NearestBuildingName = nearestBuildingName;
    }

    // getters and setters
    public String getNearestBuildingName() {
        return NearestBuildingName;
    }

    public void setNearestBuildingName(String nearestBuildingName) {
        NearestBuildingName = nearestBuildingName;
    }
}
