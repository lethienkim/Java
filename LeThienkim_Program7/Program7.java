//********************************************************************
//
//  Author:        Thienkim Le
//
//  Program #:     Seven
//
//  File Name:     Program7.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      April 5, 2024
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapters 2-6 & 15 
//
//  Description:   
//
//********************************************************************
import java.io.*;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Program7 {
    private Scanner input;
    private PrintWriter output;

	 //***************************************************************
	 //
	 //  Method:       main
	 // 
	 //  Description:  The main method of the program
	 //
	 //  Parameters:   A String Array
	 //
	 //  Returns:      N/A 
	 //
	 //**************************************************************
    public static void main(String[] args) {
        Program7 myObject = new Program7();
        myObject.openFile();
        if (myObject.output != null) {
            myObject.developerInfo();
            myObject.readRecords();
            myObject.closeFiles();
        } else {
            System.out.println("Error opening output file. Exiting program.");
        }
    }

    //***************************************************************
    //
    //  Method:       openFile
    // 
    //  Description:  Opens the input file for reading.
    //
    //  Parameters:   None
    //
    //  Returns:      N/A 
    //
    //**************************************************************

    public void openFile() {
        try {
            input = new Scanner(Paths.get("C:\\Users\\lethi\\Desktop\\ITSE 2321-Java\\LeThienkim_Program7\\Program7.txt"));
            output = new PrintWriter("C:\\Users\\lethi\\Desktop\\ITSE 2321-Java\\LeThienkim_Program7\\Program7-Output.txt");
        } catch (IOException ioException) {
            System.err.println("Error opening file: " + ioException.getMessage());
            ioException.printStackTrace();
            output = null; // Set output to null to prevent further operations
        }
    }

    //***************************************************************
    //
    //  Method:       readRecords
    // 
    // Description:  Reads faculty records from the input file, calculates
    // 				raises, sorts records by raise percentage, prints
    // 				records and summary statistics.
    //
    //  Parameters:   None
    //
    //  Returns:      N/A 
    //
    //**************************************************************

    public void readRecords() {
        output.printf("%-15s %-15s %-15s %-15s %-15s%n", "Faculty Number", "Old Salary", "Raise Percentage", "Pay Raise", "New Salary");

        double totalRaiseAmount = 0;
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        int numberOfRecords = 0;

        try {
            while (input.hasNext()) {
                double oldSalary = input.nextDouble();
                double newSalary = calculateNewSalary(oldSalary);
                double raisePercentage = calculateRaisePercentage(oldSalary, newSalary);
                double payRaise = newSalary - oldSalary;

                // Writing current record to output file
                output.printf("%-15s %-15.2f %-15.2f %-15.2f %-15.2f%n",
                        "Faculty Number", oldSalary, raisePercentage,
                        payRaise, newSalary);

                // Update totals
                totalRaiseAmount += payRaise;
                totalOldSalary += oldSalary;
                totalNewSalary += newSalary;
                numberOfRecords++;
            }

            // Print total amount of raises, average of raises, total and average of the faculty payroll
            double averageRaise = totalRaiseAmount / numberOfRecords;
            double averageOldSalary = totalOldSalary / numberOfRecords;
            double averageNewSalary = totalNewSalary / numberOfRecords;

            output.printf("%nTotal Amount of Raises: %.2f%n", totalRaiseAmount);
            output.printf("Average of Raises: %.2f%n", averageRaise);
            output.printf("Total Faculty Payroll Before Raise: %.2f%n", totalOldSalary);
            output.printf("Total Faculty Payroll After Raise: %.2f%n", totalNewSalary);
            output.printf("Average Faculty Payroll Before Raise: %.2f%n", averageOldSalary);
            output.printf("Average Faculty Payroll After Raise: %.2f%n", averageNewSalary);

        } catch (NoSuchElementException elementException) {
            System.err.println("File improperly formed. Terminating.");
            System.exit(1);
        } catch (IllegalStateException stateException) {
            System.err.println("Error reading from file. Terminating.");
            System.exit(1);
        }
    }

    // Calculate new salary based on old salary   
    //
    //  Method:       calculateNewSalary
    // 
    //  Description:  Calculates the new salary based on the old salary.
    //                If the old salary is greater than $70,000.00, a 4% raise
    //                is applied. If it's between $50,000.00 and $70,000.00,
    //                a 7% raise is applied. Otherwise, a 5.5% raise is applied.
    //
    //  Parameters:   oldSalary - The old salary of the faculty member
    //
    //  Returns:      The new salary after applying the raise
    //
    //**************************************************************

    public double calculateNewSalary(double oldSalary) {
        if (oldSalary > 70000.00) {
            return oldSalary * 1.04; // 4% raise
        } else if (oldSalary > 50000.00) {
            return oldSalary * 1.07; // 7% raise
        } else {
            return oldSalary * 1.055; // 5.5% raise
        }
    }

    //***************************************************************
    //
    //  Method:       calculateRaisePercentage
    // 
    //  Description:  Calculates the raise percentage based on the old 
    //                salary and the new salary.
    //
    //  Parameters:   double oldSalary: the old salary
    //                double newSalary: the new salary
    //
    //  Returns:      double: the raise percentage
    //
    //**************************************************************

    public double calculateRaisePercentage(double oldSalary, double newSalary) {
        return ((newSalary - oldSalary) / oldSalary) * 100;
    }

    // Close input and output files
    public void closeFiles() {
        if (input != null) {
            input.close();
        }
        if (output != null) {
            output.close();
        }
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

    public void developerInfo() {
        output.println("Name: Thienkim Le");
        output.println("Course: ITSE 2321 Object-Oriented Programming");
        output.println("Program: Seven");
        output.println();
    }
}
