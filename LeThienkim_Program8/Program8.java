
//********************************************************************
//
//  Author:        Thienkim Le
//
//  Program #:     8
//
//  File Name:     Program8.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      04/17/2024
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter 8
//
//  Description:   A program that create a class called SavingsAccount
//
//********************************************************************

public class Program8 {
	//***************************************************************
    //  This program simulates the growth of savings accounts over a period of time,
    //  adjusting the interest rate, and performing transactions.
    //**************************************************************
    public static void main(String[] args) {
    	developerInfo();
        SavingsAccount saver1 = new SavingsAccount(2000.00);
        SavingsAccount saver2 = new SavingsAccount(3000.00);

        // Set annual interest rate to 4%
        SavingsAccount.modifyInterestRate(4);

        // Calculate monthly interest for 12 months
        for (int i = 1; i <= 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
            System.out.println("Month " + i);
            System.out.println("Saver 1: " + saver1);
            System.out.println("Saver 2: " + saver2);
            System.out.println();
        }

        // Deposit $1500.00 to saver1's account and withdraw $550.00 from saver2's account
        saver1.depositAmount(1500.00);
        saver2.withdrawAmount(550.00);

        // Change annual interest rate to 5%
        SavingsAccount.modifyInterestRate(5);

        // Calculate next month's interest
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

        // Print new balances
        System.out.println("New balances after changing interest rate:");
        System.out.println("Saver 1: " + saver1);
        System.out.println("Saver 2: " + saver2);
    }
    
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
       System.out.println("Program: Eight \n");

    } // End of the developerInfo method
}
