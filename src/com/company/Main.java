package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Assume there are 4 faculties along with the 4 Parking Areas in the university.
        ParkingArea Parking_Area_of_Medical_Faculty = new ParkingArea("MEDF_001","6.91877","79.87121","Available");
        ParkingArea Parking_Area_of_UCSC = new ParkingArea("UCSC_001","6.90226","79.86115","Not Available");
        ParkingArea Parking_Area_of_Management_Faculty = new ParkingArea("MANF_001","6.85292","79.90438","Available");
        ParkingArea Parking_Area_of_Technology_Faculty = new ParkingArea("TECHF_001","6.81792","80.04372","Available");

        // declare ArrayList
        ArrayList<ParkingArea> List_of_Parking_Areas = new ArrayList<>();

        // add items to the ArrayList
        List_of_Parking_Areas.add(Parking_Area_of_Medical_Faculty);
        List_of_Parking_Areas.add(Parking_Area_of_UCSC);
        List_of_Parking_Areas.add(Parking_Area_of_Management_Faculty);
        List_of_Parking_Areas.add(Parking_Area_of_Technology_Faculty);

        // display List of the Parking Areas
        System.out.println("=======================================");
        System.out.println("Parking Areas of University of Colombo");
        System.out.println("=======================================");

        for (int i=0; i<List_of_Parking_Areas.size(); i++) {
            System.out.print(List_of_Parking_Areas.get(i).getParkingArea_ID() + "\t | \t" + List_of_Parking_Areas.get(i).getEntrance_GPSCoordinates() + "\t | \t" + List_of_Parking_Areas.get(i).getExit_GPSCoordinates() + "\t | \t" + List_of_Parking_Areas.get(i).getParkingArea_Indicator());
            System.out.println();
        }

        // Assume each Parking Area consist of 3 Standard, 2 Handicapped and 2 Long Vehicles Parking Slots
        // Standard Parking Slots
        ParkingSlot standard_1 = new Standard("MED_PS_STD_0001", "80.44372", "Available");
        ParkingSlot standard_2 = new Standard("MED_PS_STD_0002", "80.04373", "Not Available");
        ParkingSlot standard_3 = new Standard("MED_PS_STD_0003", "80.04374", "Available");

        // Handicapped Parking Slots
        Handicapped handicapped_1 = new Handicapped("MED_PS_HAD_0001", "79.05821", "Available", "Public Library");
        Handicapped handicapped_2 = new Handicapped("MED_PS_HAD_0002", "79.05822", "Available", "Junior's Canteen");

        // Long Vehicles Parking Slots
        LongVehicle longVehicle_1 = new LongVehicle("MED_PS_LNV_0001", "60.45236", "Available", 1000, 800);
        LongVehicle longVehicle_2 = new LongVehicle("MED_PS_LNV_0002", "60.45237", "Available", 1000, 800);

        // declare ArrayLists

        ArrayList<ParkingSlot> List_of_Parking_Slots_1 = new ArrayList<ParkingSlot>();
        ArrayList<Handicapped> List_of_Parking_Slots_2 = new ArrayList<Handicapped>();
        ArrayList<LongVehicle> List_of_Parking_Slots_3 = new ArrayList<LongVehicle>();

        // add items to the ArrayList
        List_of_Parking_Slots_1.add(standard_1);
        List_of_Parking_Slots_1.add(standard_2);
        List_of_Parking_Slots_1.add(standard_3);
        List_of_Parking_Slots_2.add(handicapped_1);
        List_of_Parking_Slots_2.add(handicapped_2);
        List_of_Parking_Slots_3.add(longVehicle_1);
        List_of_Parking_Slots_3.add(longVehicle_2);

        // display List of the Parking Slots
        System.out.println();
        System.out.println("=======================================");
        System.out.println("Parking Slots of University of Colombo");
        System.out.println("=======================================");
        // Standard
        for(int i=0; i<List_of_Parking_Slots_1.size(); i++) {
            System.out.println(List_of_Parking_Slots_1.get(i).getParkingSlot_ID() + "\t | \t" + List_of_Parking_Slots_1.get(i).getParkingSlot_GPSCoordinates() + "\t | \t" + List_of_Parking_Slots_1.get(i).getParkingSlot_Indicator());
        }
        // Handicapped
        for(int i=0; i<List_of_Parking_Slots_2.size(); i++) {
            System.out.println(List_of_Parking_Slots_2.get(i).getParkingSlot_ID() + "\t | \t" + List_of_Parking_Slots_2.get(i).getParkingSlot_GPSCoordinates() + "\t | \t" + List_of_Parking_Slots_2.get(i).getParkingSlot_Indicator() + "\t | \t" + List_of_Parking_Slots_2.get(i).getNearestBuildingName());
        }
        // LongVehicle
        for(int i=0; i<List_of_Parking_Slots_3.size(); i++) {
            System.out.println(List_of_Parking_Slots_3.get(i).getParkingSlot_ID() + "\t | \t" + List_of_Parking_Slots_3.get(i).getParkingSlot_GPSCoordinates() + "\t | \t" + List_of_Parking_Slots_3.get(i).getParkingSlot_Indicator() + "\t | \t" + List_of_Parking_Slots_3.get(i).getLength() + "\t | \t" + List_of_Parking_Slots_3.get(i).getWidth());
        }


    }


}
