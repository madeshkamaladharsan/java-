package com.hexaware.madesh;

import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.print("Enter your initial balance: ");
        int balance = obj.nextInt();

        while (true) {
            System.out.println("ATM Transaction");
            System.out.println("Choose 1 for Withdraw");
            System.out.println("Choose 2 for Deposit");
            System.out.println("Choose 3 for Check Balance");
            System.out.println("Choose 4 for EXIT");
            System.out.print("Choose the operation you want to perform:");

            int choice = obj.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter money to be withdrawn:");
                    int withdraw = obj.nextInt();
                    if (balance >= withdraw) {
                        balance -= withdraw;
                        System.out.println("Please collect your money");
                    } else {
                        System.out.println("Insufficient Balance");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.print("Enter money to be deposited:");
                    int deposit = obj.nextInt();
                    balance += deposit;
                    System.out.println("Your Money has been successfully deposited");
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("Balance : " + balance);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("Thank you for using our ATM. Goodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please choose again.");
            }
        }
    }
}
