//********************************************************************
//
//  Author:        Thienkim Le
//
//  Program #:     Six
//
//  File Name:     Program6.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      March 28, 2024
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter 6
//
//  Description:   This program calculates and displays the average
//                 of six test scores, all integers, after the lowest
//                 score has been dropped.
//
//                 Do not modify the main method or the header of any
//                 method.  You will not receive credit for Program 6
//                 if you do.  
//
//********************************************************************

import java.util.Scanner;

public class Program6 {
   Scanner input = new Scanner(System.in);

   //***************************************************************
   //
   //  Method:       main
   // 
   //  Description:  The main method of the program.
   //                Do NOT modify this method. If you modify it, you
   //                will not receive credit for this program.
   //
   //  Parameters:   A String Array
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public static void main(String[] args) {
	  Program6 object = new Program6();

      int test1 = 0;
      int test2 = 0;
      int test3 = 0;
      int test4 = 0;
      int test5 = 0;
      int test6 = 0;
      int lowest = 0;
      double average = 0.0;

      developerInfo();
      displayMessage();

      // Call getScore once for each of the six test scores
      test1 = object.getScore("Please enter the 1st test score: ");
      test2 = object.getScore("Please enter the 2nd test score: ");
      test3 = object.getScore("Please enter the 3rd test score: ");
      test4 = object.getScore("Please enter the 4th test score: ");
      test5 = object.getScore("Please enter the 5th test score: ");
      test6 = object.getScore("Please enter the 6th test score: ");

      // Call findLowest to find and return the lowest
      lowest = object.findLowest(test1, test2, test3, test4, test5, test6);

      // Call calcAverage to calculate and return the average
      average = object.calcAverage(test1, test2, test3, test4, test5, test6, lowest);

      // Print the average to two decimal places
      object.printAverage(lowest, average);
   }// End of the main method

   //***************************************************************
   //
   //  Method:       displayMessage
   // 
   //  Description:  This method displays a message to screen 
   //
   //  Parameters:   None
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public static void displayMessage() {
      System.out.print("This program calculates and displays ");
      System.out.println("the average of six test");
      System.out.print("scores, all integers, after the lowest ");
      System.out.println("score has been dropped. \n");
   }// end of the displayMessage method

   //***************************************************************
   //
   /// Function: getScore
   //
   // Description: Prompts the user for a test score and returns it
   //
   // Parameters: prompt - a string prompt for the user
   //
   // Returns: the test score entered by the user
   //
   //**************************************************************
   public int getScore(String prompt) {
      System.out.print(prompt);
      int score = input.nextInt();
      while (score < 0 || score > 100) {
         System.out.println("Invalid input. Test score must be between 0 and 100.");
         System.out.print(prompt);
         score = input.nextInt();
      }
      return score;
   }// end of the getScore method

   //***************************************************************
   //
   // Method: calcAverage
   //
   // Description: Calculates the average of the five highest test scores
   //
   // Parameters: s1, s2, s3, s4, s5, s6 - six test scores
   //
   //             lowest - the lowest test score
   //
   // Returns: the calculated average    
   //
   //**************************************************************
   public double calcAverage(int s1, int s2, int s3, int s4, int s5, int s6, int lowest) {
      int sum = s1 + s2 + s3 + s4 + s5 + s6 - lowest;
      return (double) sum / 5;
   }// end of calcAverage method

   //***************************************************************
   //
   // Method: findLowest
   //
   // Description: Finds and returns the lowest of six test scores
   //
   // Parameters: s1, s2, s3, s4, s5, s6 - six test scores
   //
   // Returns: the lowest test score    
   //
   //**************************************************************
   public int findLowest(int s1, int s2, int s3, int s4, int s5, int s6) {
      int min = s1;
      if (s2 < min) min = s2;
      if (s3 < min) min = s3;
      if (s4 < min) min = s4;
      if (s5 < min) min = s5;
      if (s6 < min) min = s6;
      return min;
   }// end of the findLowest method

   //***************************************************************
   //
   //  Method:       printAverage
   // 
   //  Description:  This method prints the average of the test scores 
   //
   //  Parameters:   average - the calculated average
   //                lowest - the lowest test score
   //
   //  Returns:      N/A 
   //
   //**************************************************************
   public void printAverage(int lowest, double average) {
      System.out.println("\nThe lowest test score dropped is: " + lowest);
      System.out.printf("The average of the remaining test scores is: %.2f\n", average);
   }// end of printAverage method

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
      System.out.println("Program: Six \n");
   }// End of the developerInfo method
}// End of Program6
