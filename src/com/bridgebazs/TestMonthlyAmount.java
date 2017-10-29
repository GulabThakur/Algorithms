package com.bridgebazs;

import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;

public class TestMonthlyAmount {
	public static void main(String[] args) {
		System.out.println("Program Started");
		Utility utility=new Utility();
		double principale,rate,year;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Please Enter the Amount :");
		principale=scanner.nextDouble();
		System.out.println("Please Enter the Rate :");
		rate=scanner.nextDouble();
		System.out.println("Please Enter the year :");
		year=scanner.nextDouble();
		utility.monthlyPayment(year, principale, rate);
		System.out.println("Program Ended");
	}
}
