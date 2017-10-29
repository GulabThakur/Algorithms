package com.bridgebazs;

import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;

public class VendingMachine {

	 
	public static void main(String [] args)
	{
	 System.out.println("Program started");
	 Utility utility=new Utility();
     Scanner sc1=new Scanner(System.in);
	 System.out.println("Please Enter the amount :");
	 int value=sc1.nextInt();
	 System.out.println("Note Series is ");
	 VendingMachine v1=new VendingMachine();
	 utility.vendingMachine(value);
	 System.out.println("Program Ended");
	}
	
}
