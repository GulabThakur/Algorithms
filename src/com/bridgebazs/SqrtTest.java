package com.bridgebazs;

import java.util.Scanner;

import com.bridgeLabzs.utility.Utility;

public class SqrtTest {
     	public static void main(String[] args) {
		 
     		System.out.println("Program Started");
     		Utility utility=new Utility();
     		System.out.println("Please Enter the number ");
     		Scanner scanner=new Scanner(System.in);
     		int num=scanner.nextInt();
     		utility.sqrt(num);
     		System.out.println("Program Ended");
		}
}
