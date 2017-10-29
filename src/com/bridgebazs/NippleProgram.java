package com.bridgebazs;

import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;

public class NippleProgram {
		public static void main(String[] args) {
			System.out.println("Program Started");
			Utility utility=new Utility();
			Scanner scanner =new Scanner(System.in);
			int num;
			System.out.println("Please Enter The Number ");
			num=scanner.nextInt();
			utility.toBinaryUsingString(num);
			System.out.println("Program Ended");
		}
}
