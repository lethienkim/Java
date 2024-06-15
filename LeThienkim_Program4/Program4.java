
//********************************************************************
//
//  Author:        Thienkim Le
//
//  Program #:     4
//
//  File Name:     Program4.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      02/26/224
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter 4
//
//  Description:   This program calculates an employee's gross, net, and overtime pay
//                 based on user input for employee data such as ID number, hourly rate,
//                 regular hours worked, and overtime hours worked. 
//
//********************************************************************

import java.util.Scanner;

public class Program4 {
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
        System.out.println("\nThis program computes an employee's gross, net, and overtime pay.\n");

        // Prompt user for employee data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's ID number: ");
        int idNumber = scanner.nextInt();
        System.out.print("Enter hourly rate of pay: ");
        double hourlyRate = scanner.nextDouble();
        System.out.print("Enter number of regular hours worked: ");
        double regularHours = scanner.nextDouble();
        System.out.print("Enter number of overtime hours worked: ");
        double overtimeHours = scanner.nextDouble();
        System.out.println("\n");
       
        scanner.close();

        // Calculate total hours worked
        double totalHours = regularHours + overtimeHours;

        // Calculate regular pay
        double regularPay = regularHours * hourlyRate;

        // Calculate overtime pay
        double overtimePay = (overtimeHours > 0) ? (overtimeHours * hourlyRate * 1.5) : 0;

        // Calculate gross pay
        double grossPay = regularPay + overtimePay;

        // Calculate tax
        double tax = (grossPay > 750) ? (grossPay * 0.1275) : 0;

        // Calculate deductions
        double deductions = tax + 35;

        // Calculate net pay
        double netPay = grossPay - deductions;

     // Display results
        System.out.println("\nProgram 4\n");
        System.out.println("\n");
        System.out.println("\nID Number:          " + idNumber);
        System.out.printf("Pay Rate:           $%.2f%n", hourlyRate);
        System.out.printf("Regular Hours:      %.2f%n", regularHours);
        System.out.printf("Overtime Hours:     %.2f%n", overtimeHours);
        System.out.printf("Total Hours:        %.2f%n", totalHours);
        System.out.printf("Regular Pay:        %.2f%n", regularPay);
        System.out.printf("Overtime Pay:       %.2f%n", overtimePay);
        System.out.printf("Gross Pay:          %.2f%n", grossPay);
        System.out.printf("Tax:                %.2f%n", tax);
        System.out.printf("Deductions:         %.2f%n", deductions);
        System.out.printf("Net Pay:            %.2f%n", netPay);
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
    // Developer information method
	public static void developerInfo() {
        System.out.println("Name:    Thienkim Le");
        System.out.println("Course:  ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: Four\n");
    }
}
// End of the developerInfo method
