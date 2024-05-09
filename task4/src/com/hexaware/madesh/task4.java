package com.hexaware.madesh;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("Enter Account Balance:");
		Scanner obj = new Scanner(System.in);
		int balance = obj.nextInt();
		while(true)
		{
		System.out.println("ATM Transaction");
		System.out.println("Choose 1 for Account Number");
		System.out.println("Choose 2 for EXIT");
		System.out.print("Choose the function:");
		int choice = obj.nextInt();
		switch(choice)
		{
		case 1:
		System.out.print("Enter Account Number:");
		int Account_Number = obj.nextInt();
		int n = 0;
		while(Account_Number>0) {
		n++;
		Account_Number = Account_Number/10;
		}
		if(n>=8 & n<=10)
		{
		System.out.println("Valid Account Number");
		System.out.print("Your balance is:"+balance);
		System.exit(0);
		}
		else
		{
		System.out.println("Invalid Account Number");
		choice = 1;
		}
		System.out.println("");
		break;
		case 2:
		System.exit(0);
		}
		

	}

	}
}
