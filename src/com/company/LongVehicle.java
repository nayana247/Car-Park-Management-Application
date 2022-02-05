package com.company;

public class LongVehicle extends ParkingSlot {

    // define variables
    private double Length;
    private double Width;

    // default constructor
    public LongVehicle() {
    }

    // overriding constructor
    public LongVehicle(String parkingSlot_ID, String parkingSlot_GPSCoordinates, String parkingSlot_Indicator, double length, double width) {
        super(parkingSlot_ID, parkingSlot_GPSCoordinates, parkingSlot_Indicator);
        Length = length;
        Width = width;
    }

    // getters and setters
    public double getLength() {
        return Length;
    }

    public void setLength(double length) {
        Length = length;
    }

    public double getWidth() {
        return Width;
    }

    public void setWidth(double width) {
        Width = width;
    }
}
