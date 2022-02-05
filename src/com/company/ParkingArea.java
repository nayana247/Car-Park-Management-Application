package com.company;

public class ParkingArea {

    // define variables
    public String ParkingArea_ID;
    public String Entrance_GPSCoordinates;
    public String Exit_GPSCoordinates;
    public String ParkingArea_Indicator;

    // default constructor
    public ParkingArea() {
    }

    // overriding constructor
    public ParkingArea(String parkingArea_ID, String entrance_GPSCoordinates, String exit_GPSCoordinates, String parkingArea_Indicator) {
        ParkingArea_ID = parkingArea_ID;
        Entrance_GPSCoordinates = entrance_GPSCoordinates;
        Exit_GPSCoordinates = exit_GPSCoordinates;
        ParkingArea_Indicator = parkingArea_Indicator;
    }

    // getters and setters
    public String getParkingArea_ID() {
        return ParkingArea_ID;
    }

    public void setParkingArea_ID(String parkingArea_ID) {
        ParkingArea_ID = parkingArea_ID;
    }

    public String getEntrance_GPSCoordinates() {
        return Entrance_GPSCoordinates;
    }

    public void setEntrance_GPSCoordinates(String entrance_GPSCoordinates) {
        Entrance_GPSCoordinates = entrance_GPSCoordinates;
    }

    public String getExit_GPSCoordinates() {
        return Exit_GPSCoordinates;
    }

    public void setExit_GPSCoordinates(String exit_GPSCoordinates) {
        Exit_GPSCoordinates = exit_GPSCoordinates;
    }

    public String getParkingArea_Indicator() {
        return ParkingArea_Indicator;
    }

    public void setParkingArea_Indicator(String parkingArea_Indicator) {
        ParkingArea_Indicator = parkingArea_Indicator;
    }

}
