package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        /* Nayana Tharuka
        2019T00382 */

        // Assume there are 4 faculties along with the 4 Parking Areas in the university.
        // create parking area object
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

        System.out.println("Area ID" + "\t\t | \t" + "Ent GPS" + "\t | \t" + "Ext GPS" + "\t\t | \t" + "Indicator");
        System.out.println("----------------------------------------------------------");

        for (int i=0; i<List_of_Parking_Areas.size(); i++) {
            System.out.print(List_of_Parking_Areas.get(i).getParkingArea_ID() + "\t | \t" + List_of_Parking_Areas.get(i).getEntrance_GPSCoordinates() + "\t | \t" + List_of_Parking_Areas.get(i).getExit_GPSCoordinates() + "\t | \t" + List_of_Parking_Areas.get(i).getParkingArea_Indicator());
            System.out.println();
        }

        // Assume each Parking Area consist of 3 Standard, 2 Handicapped and 2 Long Vehicles Parking Slots
        // create Standard Parking Slot objects
        ParkingSlot standard_1 = new Standard("MED_PS_STD_0001", "80.44372", "Available");
        ParkingSlot standard_2 = new Standard("MED_PS_STD_0002", "80.04373", "Not Available");
        ParkingSlot standard_3 = new Standard("MED_PS_STD_0003", "80.04374", "Available");

        // create Handicapped Parking Slot objects
        Handicapped handicapped_1 = new Handicapped("MED_PS_HAD_0001", "79.05821", "Available", "Public Library");
        Handicapped handicapped_2 = new Handicapped("MED_PS_HAD_0002", "79.05822", "Available", "Junior's Canteen");

        // create Long Vehicles Parking Slot objects
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

        // display Standard Parking Slot
        for(int i=0; i<List_of_Parking_Slots_1.size(); i++) {
            System.out.println(List_of_Parking_Slots_1.get(i).getParkingSlot_ID() + "\t | \t" + List_of_Parking_Slots_1.get(i).getParkingSlot_GPSCoordinates() + "\t | \t" + List_of_Parking_Slots_1.get(i).getParkingSlot_Indicator());
        }
        // display Handicapped Parking Slot
        for(int i=0; i<List_of_Parking_Slots_2.size(); i++) {
            System.out.println(List_of_Parking_Slots_2.get(i).getParkingSlot_ID() + "\t | \t" + List_of_Parking_Slots_2.get(i).getParkingSlot_GPSCoordinates() + "\t | \t" + List_of_Parking_Slots_2.get(i).getParkingSlot_Indicator() + "\t | \t" + List_of_Parking_Slots_2.get(i).getNearestBuildingName());
        }
        // display LongVehicle Parking Slot
        for(int i=0; i<List_of_Parking_Slots_3.size(); i++) {
            System.out.println(List_of_Parking_Slots_3.get(i).getParkingSlot_ID() + "\t | \t" + List_of_Parking_Slots_3.get(i).getParkingSlot_GPSCoordinates() + "\t | \t" + List_of_Parking_Slots_3.get(i).getParkingSlot_Indicator() + "\t | \t" + List_of_Parking_Slots_3.get(i).getLength() + "\t | \t" + List_of_Parking_Slots_3.get(i).getWidth());
        }

        // create object of Parking Area
        ParkingArea parkingArea = new ParkingArea();

        // display List of Available Parking Areas
        System.out.println();
        System.out.println("================================================");
        System.out.println("Available Parking Areas of University of Colombo");
        System.out.println("================================================");

        System.out.println("Area ID" + "\t\t | \t" + "Ent GPS" + "\t | \t" + "Ext GPS" + "\t\t | \t" + "Indicator");
        System.out.println("-------------------------------------------------------");

        parkingArea.AvailableParkingAreas(Parking_Area_of_Medical_Faculty);
        parkingArea.AvailableParkingAreas(Parking_Area_of_UCSC);
        parkingArea.AvailableParkingAreas(Parking_Area_of_Management_Faculty);
        parkingArea.AvailableParkingAreas(Parking_Area_of_Technology_Faculty);

        // create object of Parking Slot
        ParkingSlot parkingSlot = new ParkingSlot();

        // display List of Available Parking Slots
        System.out.println();
        System.out.println("================================================");
        System.out.println("Available Parking Slots of University of Colombo");
        System.out.println("================================================");

        System.out.println("Slot ID" + "\t\t\t | \t" + "Ent GPS" + "\t\t | \t" + "Indicator");
        System.out.println("------------------------------------------------");

        parkingSlot.AvailableParkingSlots(standard_1);
        parkingSlot.AvailableParkingSlots(standard_2);
        parkingSlot.AvailableParkingSlots(standard_3);
        parkingSlot.AvailableParkingSlots(handicapped_1);
        parkingSlot.AvailableParkingSlots(handicapped_2);
        parkingSlot.AvailableParkingSlots(longVehicle_1);
        parkingSlot.AvailableParkingSlots(longVehicle_2);

        /* Rusiru Ilapperuma
        2019T00354 */

        // create Student Driver object
        Driver StudentDriver_1 = new Student();
        StudentDriver_1.inputDriver(); // execute check-in
        StudentDriver_1.checkoutDriver(); // execute check-out

        /* Prabhath Nuwan
        2019T00385 */

        // create Staff Driver object
        Driver StaffDriver_1 = new Staff();
        StaffDriver_1.inputDriver();  // execute check-in
        StudentDriver_1.checkoutDriver(); // execute check-out
    }
}
