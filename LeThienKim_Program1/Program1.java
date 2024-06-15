//********************************************************************
//
//  Author:        Thienkim Le
//
//  Program #:     1
//
//  File Name:     Program1.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      02/04/224
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter 1
//
//  Description:   A program that computes the tax and tip on a restaurant bill
//
//********************************************************************

public class Program1
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
       // Declare more variables here
	   double amount = 44.50;
	   double mealCost = 44.50;
       double taxRate = 0.0825; // 8.25%
       double tipRate = 0.15;   // 15%
	   
       developerInfo();
    
       // Calculate tax, tip, and total
        double taxAmount = mealCost * taxRate;
        double subTotal = mealCost + taxAmount;
        double tipAmount = subTotal * tipRate;
        double totalAmount = subTotal + tipAmount;
    
       System.out.printf("Meal Cost:          %6.2f%n", amount);
       System.out.printf("Tax Amount(8.25%%):  %6.2f%n", taxAmount);
       System.out.printf("Sub Total:          %6.2f%n", subTotal);
       System.out.printf("Tip Amount(15%%):    %6.2f%n", tipAmount);
       System.out.printf("Total Amount:       %6.2f%n", totalAmount);

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
       System.out.println("Program: One \n");

    } // End of the developerInfo method
}