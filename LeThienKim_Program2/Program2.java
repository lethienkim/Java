//********************************************************************
//
//  Author:        Thienkim Le
//
//  Program #:     2
//
//  File Name:     Program2.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      02/15/224
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter 2
//
//  Description:   The program calculates annual property tax
//
//********************************************************************

import java.util.Scanner;

public class Program2
{
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
	public static void main(String[] args) 
	{
		developerInfo(); // Call developerInfo method to print developer information
		Scanner scanner = new Scanner(System.in);
        boolean repeat = true;

        while (repeat) {
            // Get input from user
        	System.out.print("This program calculates the property tax on an assessed value of a property.\n");
            System.out.print("Enter the actual value of the property: ");
            double propertyValue = scanner.nextDouble();

            System.out.print("Enter the current tax rate: ");
            double taxRate = scanner.nextDouble();

            // Calculate assessed value (60% of property value)
            double assessedValue = propertyValue * 0.6;

            // Calculate property tax
            double propertyTax = assessedValue / 100 * taxRate;

            // Display results
            System.out.println("\nThe Actual Value is: " + String.format("%.2f", propertyValue));
            System.out.println("The Assessed Value is: " + String.format("%.2f", assessedValue));
            System.out.println("The Tax Rate is: " + String.format("%.2f", taxRate));
            System.out.println("The Property Tax is: " + String.format("%.2f", propertyTax));
            System.out.print("\n\n");

            // Ask user if they want to repeat or exit
            System.out.print("Do you want to repeat the calculation? (yes/no): ");
            String choice = scanner.next();
            System.out.print("\n");
            if (!choice.equalsIgnoreCase("yes")) {
                repeat = false;
            }
        }

        scanner.close();
 
    } // End of the main method
	
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
	     System.out.println("Program: Two \n");

	 } // End of the developerInfo method
}