package com.hexaware.madesh;

import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Create a password:");
        String password = scanner.nextLine();
        
        
        boolean isValid = false;
        boolean hasUppercase = false;
        boolean hasDigit = false;
        
        
        if (password.length() >= 8) {
             for (int i = 0; i < password.length(); i++) {
                char ch = password.charAt(i);
                if (Character.isUpperCase(ch)) {
                    hasUppercase = true;
                } else if (Character.isDigit(ch)) {
                    hasDigit = true;
                }

                if (hasUppercase && hasDigit) {
                    isValid = true;
                    break;
                }
            }
        }
        

        if (isValid) {
            System.out.println("Password is valid.");
        } else {
            System.out.println("Password is not valid. Please make sure it meets the requirements.");
        }
  
    }
}
