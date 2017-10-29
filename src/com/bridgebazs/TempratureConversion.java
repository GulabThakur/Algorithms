package com.bridgebazs;

import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;

public class TempratureConversion {
	public static void main(String[] args) {
		System.out.println("Program Started");
		 Utility utility=new Utility();
		 boolean status=false;
		 int cesceious,feranite;
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Please Enter  the temperature in Celsius :");
		 cesceious=scanner.nextInt();
		 System.out.println("Please Enter the the temperature in Fahrenheit ");
		 feranite=scanner.nextInt();
		 if(status=(cesceious>0)) 
		 {
			 utility.temperaturConversion(cesceious);
		 }
		 if(status=(feranite>0)) 
		 {
			 utility.temperaturConversionToCelcios(feranite);
		 }
		 System.out.println("Program Ended");
	}
}
