//********************************************************************
//
//  Author:        Thienkim Le
//
//  Program #:     3
//
//  File Name:     Program3.java
//
//  Course:        ITSE 2321 Object-Oriented Programming
//
//  Due Date:      02/22/224
//
//  Instructor:    Prof. Fred Kumi 
//
//  Chapter:       Chapter 3
//
//  Description:   Create a class with three private instance variables
//
//********************************************************************


public class Program3 {
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
        // Display developer information
        developerInfo();

        // Create two Employee objects
        Employee employee1 = new Employee("John", "Doe", 2875.00);
        Employee employee2 = new Employee("Jane", "Doe", 3150.75);

        // Display yearly salary for each employee
        System.out.printf("Employee 1: %s %s: Yearly Salary: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.yearlySalary());
        System.out.printf("Employee 2: %s %s: Yearly Salary: %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.yearlySalary());

        // Give each employee a 20% raise
        employee1.giveRaise(20);
        employee2.giveRaise(20);

        // Display yearly salary after raise for each employee
        System.out.printf("Increasing employee salaries by 20%% %nEmployee 1: %s %s: Yearly Salary: %.2f%n", employee1.getFirstName(), employee1.getLastName(), employee1.yearlySalary());
        System.out.printf("Employee 2: %s %s: Yearly Salary: %.2f%n", employee2.getFirstName(), employee2.getLastName(), employee2.yearlySalary());
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
        System.out.println("Program: Three\n");
    }
}
// End of the developerInfo method
