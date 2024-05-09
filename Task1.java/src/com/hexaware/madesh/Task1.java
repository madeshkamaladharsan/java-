package com.hexaware.madesh;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
         Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter your CreditScore:");
		int CreditScore=obj.nextInt();
		System.out.println("Enter your AnnualIncome:");
		double income=obj.nextInt();
		if(CreditScore>700 && income>=50000)
				System.out.println("Congratulations,You are eligible to take loan from our bank");
		else
			System.out.println("oops,You are not eligible to take loan from our bank");

	}

}
