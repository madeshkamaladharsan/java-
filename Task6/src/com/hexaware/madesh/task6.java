package com.hexaware.madesh;
import java.util.ArrayList;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> transactions = new ArrayList<>();
        while (true) {
            System.out.println("Enter transaction amount (positive for deposit, negative for withdrawal, 0 to exit):");
            double amount = scanner.nextDouble();
            if (amount != 0) {
                transactions.add(amount);
            } else {
                break;
            }
        }
        System.out.println("Transaction History:");
        for (int i = 0; i < transactions.size(); i++) {
            double transaction = transactions.get(i);
            if (transaction > 0) {
                System.out.println("Deposit: " + transaction);
            } else {
                System.out.println("Withdrawal: " + Math.abs(transaction));
            }
        }

        scanner.close();
    }
}
