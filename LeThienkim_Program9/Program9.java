//********************************************************************
//
//  Author:        Thienkim Le
//
//  Program #:     Nine
//
//  File Name:     Program9.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      April 21, 2024
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapters 1-9, 11 & 15 
//
//  Description:   The program reads the results of a survey of households in the United States from a file. 
//                 It populates an ArrayList with the data, performs various analysis tasks, and writes the
//                 results to an output file. The analysis tasks include calculating average household income,
//                 identifying households with income above average, determining households below the poverty level,
//                 calculating the percentage of households below the federal poverty level, and estimating the 
//                 percentage of households qualifying for Medicaid.
//
//********************************************************************
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class Program9 {
    private ArrayList<HouseHold> surveyData;

    // Constructor
    public Program9() {
        surveyData = new ArrayList<>();
    }

    //***************************************************************
    //
    //  Method:       readDataFromFile
    // 
    //  Description:  Reads data from a file specified by the provided file path and populates the ArrayList 
    //                    surveyData with Household objects.
    //
    //  Parameters:   filePath - A Path object representing the file path of the input file.
    //
    //  Returns:      void 
    //
    //**************************************************************
    public void readDataFromFile(Path filePath) {
        try (BufferedReader reader = Files.newBufferedReader(filePath)) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split("\t"); // Split using tabs
                int idNumber = Integer.parseInt(parts[0]);
                double annualIncome = Double.parseDouble(parts[1]);
                int numMembers = Integer.parseInt(parts[2]);
                String state = parts[3];
                
                surveyData.add(new HouseHold(idNumber, annualIncome, numMembers, state));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //***************************************************************
    //
    //  Method:       writeHouseHoldRecordsToFile
    // 
    //  Description:  Writes household records and analysis results to a specified file. It first writes the 
    //                household records, followed by analysis results including the average household income, 
    //                households with income above average, households below the poverty level, percentage of 
    //                households below the Federal Poverty Level (FPL), and percentage of households qualifying 
    //                for Medicaid. The results are formatted and written to the file.
    //
    //  Parameters:   filePath - A Path object representing the path of the output file
    //
    //  Returns:      N/A 
    //
    //**************************************************************

    public void writeHouseHoldRecordsToFile(Path filePath) {
    	developerInfo();
        try (PrintWriter writer = new PrintWriter(filePath.toString())) {
            // Write household records
            writer.printf("%-6s%-15s%-10s%-20s\n", "ID", "Amount", "Members", "State\n");
            for (HouseHold household : surveyData) {
                writer.printf("%-6d$%-,13.2f%-10d%-30s\n", household.getIdNumber(), household.getAnnualIncome(),
                        household.getNumMembers(), household.getState());
            }

            // Perform analysis tasks
            double averageIncome = calculateAverageIncome();
            writer.println("\nFamilies above the average income of $" + String.format("%.2f", averageIncome));
            writer.printf("\n%-6s%-15s%-10s%-20s\n", "ID", "Amount", "Members", "State\n");
            for (HouseHold household : surveyData) {
                if (household.getAnnualIncome() > averageIncome) {
                    writer.printf("%-6d$%-,13.2f%-10d%-20s\n", household.getIdNumber(), household.getAnnualIncome(),
                            household.getNumMembers(), household.getState());
                }
            }

            writer.println("\nFamilies below the poverty level:");
            writer.printf("\n%-15s%-6s%-15s%-10s%-20s\n", "Poverty Level", "ID", "Amount", "Members", "State");
            for (HouseHold household : surveyData) {
                if (isBelowPovertyLevel(household)) {
                    double povertyLevel = calculatePovertyLevel(household.getNumMembers(), household.getState());
                    writer.printf("$%-,13.2f%-6d$%-,13.2f%-11d%-20s\n", povertyLevel, household.getIdNumber(),
                            household.getAnnualIncome(), household.getNumMembers(), household.getState());
                }
            }

            double percentageBelowFPL = calculatePercentageBelowFPL();
            writer.printf("\nPercentage below the 2023 poverty level is: %.2f%%\n", percentageBelowFPL);

            double percentageMedicaidEligible = calculatePercentageMedicaidEligible();
            writer.printf("\nPercentage that would qualify for Medicaid is: %.2f%%\n", percentageMedicaidEligible);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    //***************************************************************
    //
    //  Method:       calculateAverageIncome
    // 
    //  Description:  Calculates the average annual income of households in the survey data.
    //
    //  Parameters:   None
    //
    //  Returns:      The average household income as a double
    //
    //**************************************************************
    private double calculateAverageIncome() {
        double totalIncome = 0;
        for (HouseHold household : surveyData) {
            totalIncome += household.getAnnualIncome();
        }
        return totalIncome / surveyData.size();
    }

    //***************************************************************
    //
    //  Method:       isBelowPovertyLevel
    // 
    //  Description:  Determines whether a given household's income is below the poverty level based on the number of 
    //                    members and the state.
    //
    //  Parameters:   household - A HouseHold object representing the household to check
    //
    //  Returns:      true if the household's income is below the poverty level, false otherwise
    //
    //**************************************************************
    private boolean isBelowPovertyLevel(HouseHold household) {
        double povertyLevel = calculatePovertyLevel(household.getNumMembers(), household.getState());
        return household.getAnnualIncome() < povertyLevel;
    }

    //**********************************************************************
    //
    //  Method:       calculatePercentageBelowFPL
    // 
    //  Description:  Calculates the percentage of households below the Federal Poverty Level (FPL) in the survey data.
    //
    //  Parameters:   None
    //
    //  Returns:      The percentage of households below FPL as a double
    //
    //**********************************************************************
    private double calculatePercentageBelowFPL() {
        int countBelowFPL = 0;
        for (HouseHold household : surveyData) {
            if (isBelowPovertyLevel(household)) {
                countBelowFPL++;
            }
        }
        return (double) countBelowFPL / surveyData.size() * 100;
    }

    //***************************************************************
    //
    //  Method:       calculatePovertyLevel
    // 
    //  Description:  Calculates the poverty level income based on the number of household members and the state.
    //
    //  Parameters:   numMembers - An integer representing the number of members in the household
    //                    state - A String representing the state where the household resides
    //
    //  Returns:      The poverty level income as a double
    //
    //**************************************************************
    private double calculatePovertyLevel(int numMembers, String state) {
        double povertyLevel;
        if (state.equals("Alaska")) {
            povertyLevel = 22680.00 + 5910.00 * (numMembers - 2);
        } else if (state.equals("Hawaii")) {
            povertyLevel = 24640.00 + 6430.00 * (numMembers - 2);
        } else {
            povertyLevel = 19720.00 + 5140.00 * (numMembers - 2);
        }
        return povertyLevel;
    }


    //***************************************************************
    //
    //  Method:       calculatePercentageMedicaidEligible
    // 
    //  Description:  This method calculates the percentage of households that qualify for Medicaid based on the Federal 
    //                    Poverty Level (FPL). It assumes that all states use 138% of the FPL as the eligibility threshold.
    //
    //  Parameters:   None
    //
    //  Returns:      The percentage of households qualifying for Medicaid as a double
    //
    //**************************************************************

    private double calculatePercentageMedicaidEligible() {
        int countMedicaidEligible = 0;
        for (HouseHold household : surveyData) {
            double householdIncome = household.getAnnualIncome();
            String householdState = household.getState();
            double povertyLevel;

            if (householdState.equals("Alaska")) {
                povertyLevel = calculatePovertyLevel(household.getNumMembers(), householdState);
                povertyLevel += 0.38 * povertyLevel; // Alaska uses 138% of FPL
            } else if (householdState.equals("Hawaii")) {
                povertyLevel = calculatePovertyLevel(household.getNumMembers(), householdState);
                povertyLevel += 0.38 * povertyLevel; // Hawaii uses 138% of FPL
            } else {
                povertyLevel = calculatePovertyLevel(household.getNumMembers(), householdState) * 1.38;
            }

            if (householdIncome <= povertyLevel) {
                countMedicaidEligible++;
            }
        }
        return (double) countMedicaidEligible / surveyData.size() * 100;
    }


    //***************************************************************
    //
    //  Method:       main
    // 
    //  Description:  The main method of the program. It creates an instance of Program9 class, reads data from 
    //                   a file into an ArrayList, performs analysis tasks, and writes the results to an output file.
    //
    //  Parameters:   args - A String Array containing command-line arguments
    //
    //  Returns:      N/A 
    //
    //**************************************************************

    public static void main(String[] args) {
        Program9 program9 = new Program9();
        
        program9.readDataFromFile(Paths.get("C:\\Users\\lethi\\Desktop\\ITSE 2321-Java\\LeThienkim_Program9\\Program9.txt"));
        program9.writeHouseHoldRecordsToFile(Paths.get("C:\\Users\\lethi\\Desktop\\ITSE 2321-Java\\LeThienkim_Program9\\Program9-Output.txt"));
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
        System.out.println("Name: Thienkim Le");
        System.out.println("Course: ITSE 2321 Object-Oriented Programming");
        System.out.println("Program: Nine");
        System.out.println();
    }
}
