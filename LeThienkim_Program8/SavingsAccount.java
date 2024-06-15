//********************************************************************
//  Author: Thienkim Le
//
//  Filename: SavingAccount.java
//
//  Description: This program tests the SavingsAccount class by simulating
//               monthly interest calculation, deposits, and withdrawals.
//********************************************************************

public class SavingsAccount {
    private static double annualInterestRate;
    private double savingsBalance;

    //********************************************************************
    //  Constructs a SavingsAccount object with a given balance.
    //  @param balance initial balance of the account
    //********************************************************************
    public SavingsAccount(double balance) {
        savingsBalance = balance;
    }

    //********************************************************************
    //  Calculates the monthly interest based on the annual interest rate
    //  and adds it to the balance.
    //********************************************************************
    public void calculateMonthlyInterest() {
        double monthlyInterest = savingsBalance * (annualInterestRate / 12) / 100;
        savingsBalance += monthlyInterest;
    }

    //********************************************************************
    //  Allows the customer to deposit money into the account (thereby increasing the balance).
    // @param amount the amount to deposit
    //********************************************************************
    public void depositAmount(double amount) {
        if (amount > 0) {
            savingsBalance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    //********************************************************************
    //  Allows the customer to withdraw money from the account (thereby decreasing the balance).
    //  @param amount the amount to withdraw
    //********************************************************************
    public void withdrawAmount(double amount) {
        if (amount > 0 && amount <= savingsBalance) {
            savingsBalance -= amount;
        } else {
            System.out.println("Invalid withdrawal amount or insufficient balance.");
        }
    }

    //********************************************************************
    //  Modifies the annual interest rate.
    //  @param rate the new annual interest rate
    //********************************************************************
    public static void modifyInterestRate(double rate) {
        if (rate >= 2 && rate <= 5) {
            annualInterestRate = rate;
        } else {
            System.out.println("Invalid interest rate. Rate should be between 2 and 5.");
        }
    }

    //********************************************************************
    // Gets the string representation of the SavingsAccount object.
    // @return string representation of the object
    //********************************************************************
    @Override
    public String toString() {
        return "Balance: $" + String.format("%.2f", savingsBalance);
    }
}
