package com.hexaware.madesh;
import java.util.Scanner;
import java.lang.Math;

public class Task3 {
public static void main(String[] args) {
System.out.println("Enter the number of users:");
Scanner sc = new Scanner(System.in);
int n = sc.nextInt(); 
for(int i=0;i<n;i++) {
System.out.println("Enter Initial Balance:");
double Initial_balance = sc.nextInt();
System.out.println("Enter Annual Interest:");
double Annual_Interest = sc.nextInt();
System.out.println("Enter Number of Years:");
double No_Of_Years = sc.nextInt();
double Future_balance = Initial_balance * Math.pow((1 + Annual_Interest/100),
No_Of_Years) ;
System.out.println("Future balance: "+Future_balance);
}}}