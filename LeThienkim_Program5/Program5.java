//********************************************************************
//
//  Author:        Thienkim Le
//
//  Program #:     5
//
//  File Name:     Program5.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      02/29/2024
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter 5
//
//  Description:   This program calculates a hotel's occupancy rate
//                 based on user input regarding the number of floors,
//                 rooms, and occupied rooms on each floor.
//
//********************************************************************

import java.util.Scanner;

public class Program5 {
    //***************************************************************
    //
    //  Method:       main
    // 
    //  Description:  The main method of the program
    //
    //  Parameters:   String array
    //
    //  Returns:      N/A 
    //
    //**************************************************************
    public static void main(String[] args) {
    	developerInfo(); // Display developer information
        Scanner scanner = new Scanner(System.in);

        System.out.println("This program calculates a hotel's occupancy rate\n");

        // Ask the user for the number of floors in the hotel
        System.out.print("How many floors does the hotel have? ");
        int numberOfFloors = scanner.nextInt();

        int totalRooms = 0;
        int totalOccupiedRooms = 0;

        // Iterate for each floor to get the number of rooms and occupied rooms
        for (int i = 1; i <= numberOfFloors; i++) {
            System.out.print("\nHow many rooms are on floor " + i + "? ");
            int roomsOnThisFloor = scanner.nextInt();
            totalRooms += roomsOnThisFloor;

            System.out.print("How many of those rooms are occupied? ");
            int occupiedRoomsOnThisFloor = scanner.nextInt();
            totalOccupiedRooms += occupiedRoomsOnThisFloor;
        }

        scanner.close();

        // Calculate the number of unoccupied rooms
        int unoccupiedRooms = totalRooms - totalOccupiedRooms;

        // Calculate the occupancy rate
        double occupancyRate = ((double) totalOccupiedRooms / totalRooms) * 100;

        // Display the results
        System.out.println("\nThe hotel has a total of " + totalRooms + " rooms.");
        System.out.println(totalOccupiedRooms + " are occupied.");
        System.out.println(unoccupiedRooms + " are unoccupied.");
        System.out.printf("The occupancy rate is %.1f%%\n", occupancyRate);
 
    } 
    // End of the main method
	
	//***************************************************************
    //
    //  Method:       developerInfo
    // 
    //  Description:  The developer information method of the program
    //
    //  Parameters:   None
    //
    //  Returns:      N/A 
    //
    //**************************************************************
    public static void developerInfo()
    {
       System.out.println("Name:    Thienkim Le");
       System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
       System.out.println("Program: Five \n");

    } // End of the developerInfo method
}